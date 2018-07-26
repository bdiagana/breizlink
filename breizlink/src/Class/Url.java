package Class;



import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;


public class Url {
	public String dateCreation;
	public String urlSimple;
	public String urlRaccourci;

	
	
	public Url(String dateCreation, String urSimple, String urlRaccourci) {
		this.dateCreation = dateCreation;
		this.urlSimple = urSimple;
		this.urlRaccourci = urlRaccourci;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getUrSimple() {
		return urlSimple;
	}
	public void setUrSimple(String urSimple) {
		this.urlSimple = urSimple;
	}
	public String getUrlRaccourci() {
		return urlRaccourci;
	}
	public void setUrlRaccourci(String urlRaccourci) {
		this.urlRaccourci = urlRaccourci;
	}
	
	public String generateUrlRaccourci() {
		RandomStringGenerator randomStringGenerator =
		        new RandomStringGenerator.Builder()
		                .withinRange('0', 'z')
		                .filteredBy(CharacterPredicates.LETTERS, CharacterPredicates.DIGITS)
		                .build();
		String generate= randomStringGenerator.generate(5);
		String urlRaccourci="http://localhost:8080/url/"+generate; 
			return urlRaccourci;
	}
	
	

}

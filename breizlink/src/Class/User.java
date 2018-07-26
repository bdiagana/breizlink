package Class;

public class User {
	private String login;
	private String email;
	private String password;
	private String statut;
	
	public User( String login, String email, String password, String statut) {
		
		this.login = login;
		this.email = email;
		this.password = password;
		this.statut = statut;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	

}

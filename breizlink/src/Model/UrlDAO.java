package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

import Class.Url;

public class UrlDAO {
	private static PreparedStatement pS;
	
	public void addUrl(Url url) throws SQLException, ClassNotFoundException {
		Connection con=  (Connection) DAO.connect();
		 pS = con.prepareStatement("INSERT INTO url (id, date_creation, urlsimple, urlraccourci)" + "values (default, ?, ?, ?)"); 
		 pS.setString(1, url.getDateCreation());
		 pS.setString(2, url.getUrSimple());
		 pS.setString(3, url.getUrlRaccourci());
		 pS.executeUpdate(); 
		 pS.close(); 
	}
}

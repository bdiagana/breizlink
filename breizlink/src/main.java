
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Class.Mail;
import Class.Url;
import Class.User;
import Model.DAO;

public class main {
	 private static Connection con;
	 private static java.sql.Statement stmt;
	 private static ResultSet rs; 
	 private static PreparedStatement pS;

	 public static void main(String[] args) throws SQLException, ClassNotFoundException {
		 
//		 Connection con = null;
//		 try {
//		     con =
//		        DriverManager.getConnection("jdbc:mysql://localhost/projet1?" +
//		                                    "user=root&password=");
//		     System.out.println("ok");
//
//		     stmt = con.createStatement();
//		     rs = stmt.executeQuery("SELECT * FROM clients");
//		     while (rs.next()) { int ID = rs.getInt("id");
//		     String Nom = rs.getString("nom");
//		     String Prenom = rs.getString("prenom"); 
//		    
//		     System.out.println(ID + "\t" + Nom + "\t" + Prenom + "\t");
//		     }
//		     
//		     
//		 } catch (SQLException ex) {
//		     // handle any errors
//		     System.out.println("SQLException: " + ex.getMessage());
//		     System.out.println("SQLState: " + ex.getSQLState());
//		     System.out.println("VendorError: " + ex.getErrorCode());
//		 } 
		
		// User u1= new User("Yahya","yahya@orange.fr","123SOleil","statut");
		// u1.addUser();
//		 Url url= new Url("bl","ajdadaj","sadada");
//		 String urlR= url.generateUrlRaccourci();
//		 url.setUrlRaccourci(urlR);
		 
		 Mail m = new Mail("bdiagana@customer.com");
		 m.getUserId();
		 
		 
	 }
	
}

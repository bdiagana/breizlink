package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DAO {
	static String bdd="link";
	String table;
	 private static Connection con;
	 private static java.sql.Statement stmt;
	 private static ResultSet rs; 
	 private static PreparedStatement pS;
	


	public DAO() {
	
	}
	
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public static Connection connect() throws ClassNotFoundException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver"); 
		 try {
		     con =
		        DriverManager.getConnection("jdbc:mysql://localhost/"+bdd+"?" +
		                                    "user=root&password=");
		     System.out.println("ok");

		 } catch (SQLException ex) {
		     // handle any errors
		     System.out.println("SQLException: " + ex.getMessage());
		     System.out.println("SQLState: " + ex.getSQLState());
		     System.out.println("VendorError: " + ex.getErrorCode());
		 } 
		 return con;
	}





	public static PreparedStatement getpS() {
		return pS;
	}

	public static void setpS(PreparedStatement pS) {
		DAO.pS = pS;
	}

}

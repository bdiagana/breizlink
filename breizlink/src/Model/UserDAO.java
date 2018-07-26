package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

import Class.User;

public class UserDAO {
	private static PreparedStatement pS;
	
	public void addUser(User user) throws SQLException, ClassNotFoundException {

		Connection con= (Connection) DAO.connect();
		 pS = con.prepareStatement("INSERT INTO user (id, login, email, password, statut, confirm)" + "values (default, ?, ?, ?,?,?)"); 
		 pS.setString(1, user.getLogin());
		 pS.setString(2, user.getEmail());
		 pS.setString(3, user.getPassword());
		 pS.setString(4, user.getStatut());
		 pS.setBoolean(5, false);
		 pS.executeUpdate(); 
		 pS.close(); 
	}
	public void confirmUser(int id) throws ClassNotFoundException, SQLException {
		Connection con= (Connection) DAO.connect();
		 pS = con.prepareStatement("UPDATE `user` SET `confirm`=? WHERE `id`=? ");
		 pS.setBoolean(1, true);
		 pS.setInt(2, id);
		 pS.executeUpdate(); 
		 pS.close(); 
	}
	



}


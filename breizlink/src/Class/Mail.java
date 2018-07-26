package Class;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import com.mysql.jdbc.Connection;

import Model.DAO;

public class Mail {

	private static String from="diagana.bayahya@gmail.com";
	private String to ;
	private static String host = "aspmx.l.google.com";
	
	
	
	public Mail(String to) {
		this.to = to;
	}
	
	public int getUserId() throws ClassNotFoundException, SQLException {
		Connection con= (Connection) DAO.connect();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT id from user where email='"+this.to+"'");
		while (rs.next()) {
			  int id = rs.getInt("id");
			  return id;
			}
		return 0;
	}

	public void sendMail() throws ClassNotFoundException, SQLException {
	// Get system properties
    Properties properties = System.getProperties();

    // Setup mail server
    properties.setProperty("mail.smtp.host", host);

    // Get the default Session object.
    Session session = Session.getDefaultInstance(properties);
    
    

    try {
       // Create a default MimeMessage object.
       MimeMessage message = new MimeMessage(session);

       // Set From: header field of the header.
       message.setFrom(new InternetAddress(Mail.from));

       // Set To: header field of the header.
       message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

       // Set Subject: header field
       message.setSubject("Confirmation de votre compte");
       int id = this.getUserId();

       // Now set the actual message
       message.setText("Cliquez sur le liens: http://localhost:8080/breizlink/Controller?action=confirm&id="+id+"' pour confirmer votre compte.");

       // Send message
       Transport.send(message);
       System.out.println("Sent message successfully....");
    } catch (MessagingException mex) {
       mex.printStackTrace();
    }
 }
}

package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Class.Mail;
import Class.Url;
import Class.User;
import Model.UrlDAO;
import Model.UserDAO;

/**
 * Servlet implementation class urlController
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = null;
		String action = request.getParameter("action");
		if (action == null) {
			action = "int1";
		}
		switch (action) {
			case "int1":
				page = "interface1.jsp";
				break;
			case "confirm":
				page = "interface1.jsp";
				int id =  Integer.parseInt(request.getParameter("id"));
				
				UserDAO user = new UserDAO();
			try {
				user.confirmUser(id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
				break;
		}
		
		request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = null;
		String action = request.getParameter("action");
		if (action == null) {
			action = "int1";
		}
		switch (action) {
			case "int1":
				page = "interface1.jsp";
				break;		
			case "raccourcir":
			page = "interface1.jsp";
			String urlSimple = request.getParameter("urlSimple");
			String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); 
			 Url url= new Url(date,urlSimple,null);
			 String urlR= url.generateUrlRaccourci();
			 url.setUrlRaccourci(urlR);
			 UrlDAO urlD = new UrlDAO();
			 try {
				urlD.addUrl(url);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			break;
			case "createUser":
				page = "interface1.jsp";
				String login= request.getParameter("login");
				String email = request.getParameter("email");
				String mdp = request.getParameter("mdp");
				String statut = request.getParameter("options");
				User u = new User(login, email, mdp, statut);
				UserDAO uD = new UserDAO();
				Mail m = new Mail(email);
				
			try {
				uD.addUser(u);
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				m.sendMail();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				break;		
				
			case "confirm":
				page = "interface1.jsp";
				int id =  Integer.parseInt(request.getParameter("id"));
				
				UserDAO user = new UserDAO();
			try {
				user.confirmUser(id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
				break;
	}
		
		if(request.getParameter("btn-accueil")!= null) {
			page="interface1.jsp";
		}else if (request.getParameter("btn-pres")!= null) {
			page="interface1.jsp";
		}else if (request.getParameter("btn-compte")!= null) {
			page="interface5.jsp";
		}else if (request.getParameter("btn-compte")!= null) {
			page="interface5.jsp";
		}
		
		request.getRequestDispatcher(page).forward(request, response);
	}

}

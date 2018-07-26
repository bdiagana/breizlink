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
import javax.servlet.http.HttpSession;

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
			String link = request.getParameter("link");
			 System.out.println(link);
			 if(link != null) { 
			 action = "link";
			 }else {
				 action = "int1";
			 }
		}
		switch (action) {
			case "link":
				String link = request.getParameter("link");
				UrlDAO url= new UrlDAO();
			try {
				String	simple= url.linkredirect(link);
				page= simple;
				response.sendRedirect(page);
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			case "int1":
				page = "interface1.jsp";
				request.getRequestDispatcher(page).forward(request, response);
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
				
			request.getRequestDispatcher(page).forward(request, response);
				break;
		}
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = null;
		String action = request.getParameter("action");
		
		HttpSession session = request.getSession();
		if(session != null) {
			page="interface6.jsp";
		}
		 if (action == null) {
			action = "int1";
		}
		
		switch (action) {
			case "int1":
				page = "interface1.jsp";
				break;		
			case "raccourcir":
			page = "interface3.jsp";
			String urlSimple = request.getParameter("urlSimple");
			String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); 
			 Url url= new Url(date,urlSimple,null);
			 String urlR= url.generateUrlRaccourci();
			 url.setUrlRaccourci(urlR);
			 session.setAttribute( "url", urlR );
			 session.setAttribute( "urlS", urlSimple);
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
			if(session != null) {
				page="interface6.jsp";
			}else {
			page="interface1.jsp";
			}
		}else if (request.getParameter("btn-pres")!= null) {
			page="interface1.jsp";
		}else if (request.getParameter("btn-compte")!= null) {
			page="interface5.jsp";
		}else if (request.getParameter("btn-compte")!= null) {
			page="interface5.jsp";
		}else if (request.getParameter("connexion")!= null) {
			String login= request.getParameter("id");
			String password = request.getParameter("mdp");
			UserDAO user = new UserDAO();
			try {
				if (user.authentification(login, password)==true) {
					page="interface6.jsp";

					session.setAttribute( "id", login );
				}else {
					page= "interface1.jsp";
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if (request.getParameter("deconnexion")!= null) {
			page="interface1.jsp";
	        session.invalidate();
		}
		
		else if (request.getParameter("moncompte")!= null) {
			page="interface7.jsp";
		}
		
		request.getRequestDispatcher(page).forward(request, response);
	}

}

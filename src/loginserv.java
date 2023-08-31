

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mode.UserDao;
import mode.user;

/**
 * Servlet implementation class loginserv
 */
@WebServlet("/loginserv")
public class loginserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password= request.getParameter("password");
		
		
		UserDao db= new UserDao();
		try {
			if(db.logincheck(username, password))
			{
				response.sendRedirect("Dashborduser.html");
				//out.println("login succesfully");
				
			}
			else
			{
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("something_went_wrong.html");
				requestDispatcher.include(request, response);
				//out.println("Username or Password incorrect");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

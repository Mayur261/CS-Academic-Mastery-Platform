

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mode.UserDao;
import mode.user;

/**
 * Servlet implementation class adminlog
 */
@WebServlet("/adminlog")
public class adminlog extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String aduser = request.getParameter("username");
		String adpass= request.getParameter("password");
		String u="ADMIN";
		String p="ADMIN";
		if(aduser.equals(u) && adpass.equals(p))
		{
			
			response.sendRedirect("adminDash.html");
		}
		else
		{
			out.println("Wrong username and password");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

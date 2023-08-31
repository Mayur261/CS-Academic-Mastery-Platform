

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mode.UserDao;

/**
 * Servlet implementation class forgat
 */
@WebServlet("/forgat")
public class forgat extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String newpassword = request.getParameter("newpassword");
		
		UserDao db= new UserDao();
		try {
			if(db.forgat(username, newpassword)>0)
			{
				out.println("<h3>Password updated successfully!</h3>");
            } else {
                out.println("<h3>Please Enter Valid Username!</h3>");
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

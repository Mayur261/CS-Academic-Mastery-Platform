

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import mode.UserDao;
import mode.user;

/**
 * Servlet implementation class ProfileUser
 */
@WebServlet("/ProfileUser")
public class ProfileUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		String saddress=request.getParameter("address");
		String caddress=request.getParameter("location");
		String college=request.getParameter("College");
		String course=request.getParameter("Course");
		String total_sem=request.getParameter("Total_sem");
		String remaining_sem=request.getParameter("remaining_sem");
		
		user u=new user(name, number, saddress, caddress, college, course, total_sem, remaining_sem);
		System.out.println(u);
		UserDao db=new UserDao();
		try {
			int a = db.userprof(u);
			if(a>0)
			{
				out.println("<br><br>");
				out.println("data inserted");
			}
			else
			{
				out.println("data not inserted");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

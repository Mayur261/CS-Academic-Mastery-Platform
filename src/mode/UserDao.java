package mode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {

	static String driver="com.mysql.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/dremproject";
	static String db_name="root";
	static String db_pass="abc123";
	
	static Connection getconnection() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,db_name,db_pass);
		return con;
	}
	
	//insert
	public int save(user u) throws ClassNotFoundException, SQLException
	{
		Connection con=getconnection();
		String sql="insert into user(fname, lname, email, username, password) value('"+u.getFname()+"','"+u.getLname()+"','"+u.getEmail()+"','"+u.getUsername()+"','"+u.getPassword()+"')";
		Statement st =con.createStatement();
		int a = st.executeUpdate(sql);
		con.close();
		return a;
		
	}
	//userlogincheck
	public static boolean logincheck(String username, String password) throws ClassNotFoundException, SQLException
	{
		boolean st =false;
		Connection con= getconnection();
		String sql="Select * from user where username=? and password=?";
		java.sql.PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		
	    ResultSet rs =ps.executeQuery();
	    st = rs.next();
	    return st;
	}
	//admincheck
	
	public static boolean  admincheck(String aduser, String adpass) throws ClassNotFoundException, SQLException
	{
		boolean st =false;
		Connection con = getconnection();
		String sql = "Select * from user where aduser=? and aspass=?";
		java.sql.PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, aduser);
		ps.setString(2, adpass);	
		 ResultSet rs =ps.executeQuery();
		 st = rs.next();
		 return st;
	}
	/*public static boolean logincheck(String username, String password) throws ClassNotFoundException, SQLException
	{
		boolean st =false;
		Connection con= getconnection();
		String sql="Select * from user where username=? and password=?";
		java.sql.PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		
	    ResultSet rs =ps.executeQuery();
	    st = rs.next();
	    return st;
	}*/
	
	//forgat
	public int forgat(String username,String newpassword) throws ClassNotFoundException, SQLException
	{
		int status;
		Connection con = getconnection();
		String sql="UPDATE user SET password=? WHERE username=?;";
		java.sql.PreparedStatement ps =con.prepareStatement(sql);
		ps.setString(1, newpassword);
		ps.setString(2, username);
		status =ps.executeUpdate();
		ps.close();
		return status;
	}
	
	//profileusedetails
	public int userprof(user u) throws ClassNotFoundException, SQLException
	{
		Connection con=getconnection();
		String sql="insert into profileuser(name,number,saddress,caddress,college,course,total_sem,remaining_sem) value('"+u.getName()+"','"+u.getNumber()+"','"+u.getSaddress()+"','"+u.getCaddress()+"','"+u.getCollege()+"','"+u.getCourse()+"','"+u.getTotal_sem()+"','"+u.getRemaining_sem()+"')";
		Statement st =con.createStatement();
		int a = st.executeUpdate(sql);
		con.close();
		return a;
		
	}
	
	public boolean userprofile(String email) throws ClassNotFoundException, SQLException
	{
		boolean st =false;
		Connection con= getconnection();
		String sql="Select * from user where email=?";
		java.sql.PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);
		ResultSet rs =ps.executeQuery();
		 st = rs.next();
		 return st;
	}
}


package com.example;

 import java.io.IOException;
 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import java.io.PrintWriter;

 import java.sql.*;
 /**
  * Servlet implementation class Login
  */
 @WebServlet("/Change")
 public class Change extends HttpServlet {
 	private static final long serialVersionUID = 1L;
 	Connection con;
 	Statement st;
 	ResultSet rs;
     /**
      * @see HttpServlet#HttpServlet()
      */
     public Change() {
         super();
         // TODO Auto-generated constructor stub
         try
     	{
     		Class.forName("com.mysql.jdbc.Driver");
     		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mailpro","root","Hinata@999");
     		st=con.createStatement();
     		System.out.println("connected now");
     	}
     	catch(Exception e1)
     	{
     		System.out.println("Sorry we are not connected");
     	}
     }

 	/**
 	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 	 */
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		
 		// TODO Auto-generated method stub
 		String curr_pass=request.getParameter("curr_pass");
 		String new_pass=request.getParameter("new_pass");
 		PrintWriter pw=response.getWriter();
 		HttpSession hs=request.getSession();
 		String pass=hs.getValue("username").toString();
 		System.out.println("pass is "+pass);
 		try
 		{
// 		rs=st.executeQuery("update user SET password='"+new_pass+"' WHERE password='"+curr_pass+"'");
// 		PreparedStatement stmt=con.prepareStatement("update user set password='"+new_pass+"' WHERE password='"+curr_pass+"'");
 			PreparedStatement stmt=con.prepareStatement("update user set password=? WHERE username=? AND password=?");
 			stmt.setString(1,new_pass);
 			stmt.setString(2, pass);
 			stmt.setString(3, curr_pass);
        stmt.execute();  
//        System.out.println("prev and new passwords are "+curr_pass+" "+new_pass);
        System.out.println("done");
        response.sendRedirect("/valid.html");
// 		stmt.setInt(1,p.id);
// 		if(rs.next())
// 		{
// 			 System.out.println("done");
// 		}
// 		else
// 		{
// 			pw.println("<center><a href='login.html'><font face='comic sans ms' color='lime'>Sorry you are not a valid user plz try again</a></center>");
// 		}
 		}
 		catch(Exception e1)
 		{
// 			System.out.println("Not done");
 		}
 	}

 }

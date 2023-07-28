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
 @WebServlet("/Compose")
 public class Compose extends HttpServlet {
	
 	private static final long serialVersionUID = 1L;
 	Connection con;
 	Statement st;
 	ResultSet rs;
     /**
      * @see HttpServlet#HttpServlet()
      */
     public Compose() {
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
 		String name=request.getParameter("name");
 		String Receiver=request.getParameter("receiver_name");
 		String subject=request.getParameter("subject");
 		String message=request.getParameter("message");
 		PrintWriter out=response.getWriter();
 		HttpSession hs=request.getSession();
 		String pass=(String)hs.getAttribute("username");
 		System.out.print(pass);
 		
 		try
 		{
// 		rs=st.executeQuery("update user SET password='"+new_pass+"' WHERE password='"+curr_pass+"'");
// 		PreparedStatement stmt=con.prepareStatement("update user set password='"+new_pass+"' WHERE password='"+curr_pass+"'");
 			PreparedStatement stmt=con.prepareStatement("insert into mails(sender,receiver,subject,message) values(?,?,?,?)");
 			
 			stmt.setString(1,name);
 			stmt.setString(2, Receiver);
 			stmt.setString(3, subject);
 			stmt.setString(4, message);
// 			System.out.println("name,Receiver,subject,message are "+name+" "+Receiver+" "+subject+" "+message);
        stmt.execute(); 
      
//        System.out.println("done");
        response.sendRedirect("/Compose.html");
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

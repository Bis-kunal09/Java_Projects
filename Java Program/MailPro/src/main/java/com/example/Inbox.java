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
 @WebServlet("/Inbox")
 public class Inbox extends HttpServlet {
 	private static final long serialVersionUID = 1L;
 	Connection con;
 	Statement st;
 	ResultSet rs;
     /**
      * @see HttpServlet#HttpServlet()
      */
     public Inbox() {
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
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		
 		// TODO Auto-generated method stub
 		PrintWriter out=response.getWriter();
 		HttpSession hs=request.getSession();
 		String pass=(String)hs.getAttribute("username");
 		try
 		{
// 		rs=st.executeQuery("update user SET password='"+new_pass+"' WHERE password='"+curr_pass+"'");
// 		PreparedStatement stmt=con.prepareStatement("update user set password='"+new_pass+"' WHERE password='"+curr_pass+"'");
 			PreparedStatement stmt=con.prepareStatement("select * from mails where receiver=?");
 			stmt.setString(1,pass);
// 			System.out.println("name,Receiver,subject,message are "+name+" "+Receiver+" "+subject+" "+message);
 			rs=stmt.executeQuery();
 			 out.println("<!DOCTYPE html>\n"
 			 		+ "<html>\n"
 			 		+ "<head>\n"
 			 		+ "    <title>Delete Rows with Checked Checkboxes</title>\n"
 			 		+ "    <style>\n"
 			 		+ "        table {\n"
 			 		+ "            border-collapse: collapse;\n"
 			 		+ "            width: 100%;\n"
 			 		+ "        }\n"
 			 		+ "\n"
 			 		+ "        th, td {\n"
 			 		+ "            border: 1px solid #ddd;\n"
 			 		+ "            padding: 8px;\n"
 			 		+ "            text-align: left;\n"
 			 		+ "        }\n"
 			 		+ "\n"
 			 		+ "        th {\n"
 			 		+ "            background-color: #f2f2f2;\n"
 			 		+ "        }\n"
 			 		+ "    </style>\n"
 			 		+ "</head>\n"
 			 		+ "<body>\n"
 			 		+ "    <h1>Your Messages</h1>\n"
 			 		+ "    <form action=\"Delete\" method=\"post\">\n"
 			 		+ "        <table id=\"userTable\">\n"
 			 		+ "            <tr>\n"
 			 		+ "                <th>ID</th>\n"
 			 		+ "                <th>Name</th>\n"
 			 		+ "                <th>Subject</th>\n"
 			 		+ "                <th>Message</th>\n"
 			 		+ "                <th>Delete</th>\n"
 			 		+ "            </tr>");
 		while(rs.next())
 		{
 			int id=rs.getInt("messageId");
 			String Sender=rs.getString("sender");
 			String Receiver=rs.getString("receiver");	
 			String Subject=rs.getString("subject");
 			String message=rs.getString("message");
 			out.println("<tr><td>"+id+"</td><td>"+Sender+"</td><td>"+Subject+"</td><td>"+message+"</td><td><input type=\"checkbox\" name=\"userIds\" value=\"+"+id+"\"></td></tr>"); 	        
 		}
 		out.println(" </table>\n"
 				+ "        <button type=\"submit\">Delete Message</button>\n"
 				+ "    </form>\n"
 				+ "</body>\n"
 				+ "</html>\n"
 				+ "");
 		}
 		catch(Exception e1)
 		{
// 			System.out.println("Not done");
 		}
 	}

 }

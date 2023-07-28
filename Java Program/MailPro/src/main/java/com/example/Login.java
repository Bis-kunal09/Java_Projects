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
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	Statement st;
	ResultSet rs;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		response.getWriter().println("<html><body bgColor=>");
		String name=request.getParameter("user_name");
		String pass=request.getParameter("pass");
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		hs.putValue("username",name);
		try
		{
		rs=st.executeQuery("select * from user where username='"+name+"' and password='"+pass+"'");
		if(rs.next())
		{
			String targetURL = "valid.html?data=" + hs.getValue("username");
			response.sendRedirect(targetURL);
		}
		else
		{
			pw.println("<center><a href='login.html'><font face='comic sans ms' color='lime'>Sorry you are not a valid user plz try again</a></center>");
		}
		}
		catch(Exception e1)
		{
		}
	}

}

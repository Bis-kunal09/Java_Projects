

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TableDetails {
	
	public static void main(String args[]) {

	Connection con;
    Statement st;
    ResultSet rs;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Shoping","root","Hinata@999");
        st=con.createStatement();
        PreparedStatement stmt=con.prepareStatement("show columns from products");
        rs=stmt.executeQuery();
        while(rs.next())
        {
            System.out.print("field : "+rs.getString("Field"));
            System.out.print("\t\tType : "+rs.getString("Type"));
            System.out.print("\t\tIs Null: "+rs.getString("Null"));
            System.out.print("\t\tIs primary Key: "+rs.getString("Key"));
            System.out.println();
        }
    }catch(Exception e1)
    {
        System.out.println(e1.getMessage())	;
    }
    }
}

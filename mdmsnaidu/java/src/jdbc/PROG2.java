package jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class PROG2 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/DURGA";
		String user="root";
		String pass="M1racle@123";
		Connection con =DriverManager.getConnection(url,user,pass);
		Statement stmt =con.createStatement();
	    ResultSet rs =stmt.executeQuery("select*from EMPLOYE");
	    while(rs.next()) {
		 
	    	System.out.println(rs.getInt("ID_NO")+" "+rs.getString("E_NAME")+" "+rs.getInt("AGE")
	    			+" "+rs.getString("COUNTRY"));
	    	
	    }
	    
	}

}

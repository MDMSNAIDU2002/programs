package jdbc;

import java.sql.*;

public class PROG3 {
	public static void main(String[] args)throws Exception{
     Class.forName("com.mysql.cj.jdbc.Driver");
     String url="jdbc:mysql://localhost:3306/DURGA";
     String user="root";
     String pass="M1racle@123";
     Connection con=DriverManager.getConnection(url,user,pass);
     String query="update EMPLOYE set Age=320 where E_NAME='DURGA' ";
     Statement stmt= con.createStatement();
    int rs= stmt.executeUpdate(query);
    
     System.out.println("success");
     
	}

}
//"update EMPLOYE set AGE=21 where E_NAME='DURGA'"
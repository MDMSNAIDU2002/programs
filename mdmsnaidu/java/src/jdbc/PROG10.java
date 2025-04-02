package jdbc;
import java.sql.*;
import java.util.*;
import java.sql.DriverManager;

public class PROG10 {
public static void main(String[] args) {
	String Driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/NAIDU";
	String user="root";
	String pass="M1racle@123";
	try {
		Class.forName(Driver);
		Connection con=DriverManager.getConnection(url,user,pass);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.nextLine();
		Statement s=con.createStatement();
		String Query="SELECT * FROM EMP WHERE EMP_ID LIKE'"+name+"'";
		ResultSet rs=s.executeQuery(Query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}

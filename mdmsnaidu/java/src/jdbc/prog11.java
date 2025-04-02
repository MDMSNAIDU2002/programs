package jdbc;
import java.sql.*;
public class prog11{
public static void main(String[] args) {
	String Driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/NAIDU";
	String username="root";
	String password="M1racle@123";
	try
	{
		Class.forName(Driver);
		Connection con=DriverManager.getConnection(url,username,password);
		String Query="SELECT * FROM EMP";
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=st.executeQuery(Query);
		if(rs.absolute(3))
		{
          System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}

		else

		{

			System.out.println(" exist.");

		}

		

//		while(rs.next())

//		{

//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));

//			System.out.println(rs.getString("emp_depart"));	

//		}	

	}

	catch(Exception e)

	{

		System.out.println(e);

	}

}

}


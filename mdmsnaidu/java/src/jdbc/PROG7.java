package jdbc;
import java.sql.*;
public class PROG7 {
 

	public static void main(String[] args) {
		String Driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/NAIDU";
		String user="root";
		String pass="M1racle@123";
		try
		{
			Class.forName(Driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			String Query="INSERT INTO EMP VALUES(?,?,?,?,?)";
			PreparedStatement ps =con.prepareStatement(Query);
			ps.setInt(1, 2020);
			ps.setString(2,"Durga" );
			ps.setString(3, "testing");
			ps.setString(4,"987456123");
			ps.setString(5, "200000");
			
			int rs =ps.executeUpdate();
			if(rs>0) {
				System.out.println("success");
			}
			else
			{
				System.out.println("failed");
			}
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

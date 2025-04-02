package jdbc;
import java.sql.*;
import java.util.Scanner;

public class dynamic {
	public static void main(String[] args) {
		String Driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/NAIDU";
		String user="root";
		String pass="M1racle@123";
		try
		{
			Class.forName(Driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the employee id :");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the employee name :");
			String name=sc.nextLine();
			System.out.println("enter the employee department");
			String department=sc.nextLine();
			System.out.println("enter the employee phone number");
			String phonenumber=sc.nextLine();
			System.out.println("enter the employee salary");
			String salary=sc.nextLine();
			String Quary ="INSERT INTO EMP VALUES(?,?,?,?,?)";
			PreparedStatement ps =con.prepareStatement(Quary);
			ps.setInt(1, 3434);
			ps.setString(2, "Mani");
			ps.setString(3, "database");
			ps.setString(4,"8889997770");
			ps.setString(5, "300000");
			int rs=ps.executeUpdate();
			if(rs>0)
			{
				System.out.println("Success");
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

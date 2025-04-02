package jdbc;
import java.sql.*;
import java.util.Scanner;
public class PROG8 {
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
			System.out.println("enter the employe id :");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the employe name");
			String name=sc.nextLine();
			System.out.println("enter the employe department : ");
			String department=sc.nextLine();
			String Quary="INSERT INTO EMP(EMP_ID,EMP_NAME,EMP_DEPART)VALUES(?,?,?)";
			PreparedStatement ps=con.prepareStatement(Quary);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, department);
			int rs=ps.executeUpdate();
			if(rs>0)
			{
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

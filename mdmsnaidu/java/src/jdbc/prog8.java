package jdbc;
import java.sql.*;
import java.util.*;
public class prog8 {
	public static void main(String[] args) {
		String Driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/NAIDU";
		String user="root";
		String pass="M1racle@123";
	try {
		Class.forName(Driver);
		Connection con =DriverManager.getConnection(url,user,pass);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Phone number:");
		String phno=sc.nextLine();
		System.out.println("Enter the employee Salary:");
		String salary=sc.nextLine();
		String Quary="UPDATE EMP SET EMP_PHNO=?,EMP_SALARY=? WHERE EMP_ID=3434";
		PreparedStatement ps=con.prepareStatement(Quary);
		ps.setString(1,"7788994455");
		ps.setString(2,"60000");
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
	catch(Exception e) {
		System.out.println(e);
	}
	}

}

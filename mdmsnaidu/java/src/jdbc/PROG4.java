package jdbc;
import java.sql.*;

public class PROG4 {
	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/DURGA";
		String user="root";
		String pass="M1racle@123";
		Connection con=DriverManager.getConnection(url,user,pass);
		String query=" DELETE FROM EMPLOYE WHERE ID_NO=42445";
		Statement smst=con.createStatement();
		int rs=smst.executeUpdate(query);
		System.out.println("i am ready");
	
		
	}

}
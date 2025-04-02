package jdbc;
import java.sql.*;

public class PROG1 {
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/DURGA";
		String user="root";
		String pass="M1racle@123";
		//Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/DURGA","root","M1racle@123");
		Connection con =DriverManager.getConnection(url,user,pass);
		//Statement stmt =con.createStatement();
		//String query="update EMPLOYE set AGE=21 where E_NAME='DURGA'";
		String query2="insert into EMPLOYE(ID_NO,E_NAME,DATE_OF_JOINING,COUNTRY,AGE)values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query2);
		ps.setInt(1, 42445);
		ps.setString(2, "RAJA");
		ps.setString(3, "20JAN");
		ps.setString(4,"AFRICA");
		ps.setInt(5, 30);
		int c=ps.executeUpdate();
		System.out.println("inserted success");
		//String query1="alter table EMPLOYE add column AGE int";
//		int rs=stmt.executeUpdate(query);
//		System.out.println("altered successs");
//		while(rs.next())
//		{
//			System.out.println(rs.getInt("ID_NO")+" "+rs.getString("E_NAME")+" "+rs.getString("DATE_OF_JOINING")+" "+rs.getString("COUNTRY"));
//		}
//		while(rs.next())
//		{
//			int id=rs.getInt("ID_NO");
//			String name = rs.getString("E_NAME");
//			String Date=rs.getString("DATE_OF_JOINING");
//			String Country=rs.getString("COUNTRY");
//			System.out.println(id+" "+name+" "+Date+" "+Country);
//		}
//		int c=stmt.executeUpdate(query);
//		
//		System.out.println("updated success");
		//stmt.close();
		con.close();
		//rs.close();
	
	}
	

}

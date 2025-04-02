package jdbc;
import java.sql.*;
public class PROG5 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url=("jdbc:mysql://localhost:3306/DURGA");
		String user="root";
		String pass="M1racle@123";	
		int ID_NO=2222;
		String password="Passme123";
		Double newsalary=30000.00; 
		String newdepartment="INNOVATION department";
		String query="UPDATE EMPLOYE SET salary = ?,DEPARTMENR = ? WHERE ID_NO = ?";
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement pstmt =con.prepareStatement(query);
			pstmt.setDouble(1, newsalary);
			pstmt.setString(2, newdepartment);
			pstmt.setInt(3,  ID_NO);
			int rs=pstmt.executeUpdate();
			if(rs>0) {
				System.out.println("employe data updated");
			}else {
					System.out.println("no employe data updated");
				}
			pstmt.close();
			con.close();
			}catch(SQLException e) {
			e.printStackTrace();
				
		}
	}
}
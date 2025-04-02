package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PROG11 {
public static void main(String[] args) throws SQLException,ClassNotFoundException{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=null;
Statement stmt=null;
PreparedStatement pstmt=null;
String query=null;
Scanner sc=new Scanner(System.in);
try {
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","M1racle@123");
while(true)
{
System.out.println("Enter first name:");
String fname=sc.nextLine();
System.out.println("Enter last name:");
String lname=sc.nextLine();
System.out.println("Enter mobile number:");
String mobile=sc.nextLine();
int eid=0;
query="insert into employeedetails(fname, lname, mobile) values(?,?,?)";
pstmt=con.prepareStatement(query);
pstmt.setString(1,fname);
pstmt.setString(2,lname);
pstmt.setString(3,mobile);
pstmt.executeUpdate();
stmt =con.createStatement();
ResultSet rs1=stmt.executeQuery("select eid from employeedetails where fname='"+fname+"'");
if(rs1.next())
{
eid=rs1.getInt(1);
}
String uname =fname.substring(0, 1)+lname+"@mywebsite.com";
String pass=fname.substring(0, 2)+lname.substring(lname.length()-2)+mobile.substring(4);
stmt=con.createStatement();
query="select username from credentials where username='"+uname+"'";
ResultSet rs=stmt.executeQuery(query);

if(rs.next()&&rs.getString("username").equals(uname))
{
throw new Exception("Username already exists");
}
else {
query="insert into credentials(eid,username, password) values(?,?,?)";
pstmt=con.prepareStatement(query);
pstmt.setInt(1,eid);
pstmt.setString(2, uname);
pstmt.setString(3, pass);
int res=pstmt.executeUpdate();
if(res!=-1)
{
System.out.println("Credentials generated");
System.out.println("If you want to view the credentials? [yes/no]");
String opi=sc.nextLine();
if(opi.equalsIgnoreCase("yes"))
{
stmt=con.createStatement();
query="select username,password from credentials where username='"+uname+"'";
rs=stmt.executeQuery(query);
while(rs.next())
{
System.out.println(rs.getString("username")+" "+rs.getString("password"));
}

}
else if(opi.equalsIgnoreCase("no"))
{
System.out.println("If you want to add an another employee? [yes/no]");
opi=sc.nextLine();
if(!opi.equalsIgnoreCase("yes"))
{
System.out.println("Exiting");
    break;
}
   
}
else
{
System.out.println("Invalid option");
}
}
else
{
System.out.println("Failed to generate");
}
}
}
} catch (Exception e) {
System.out.println(e);
}
finally {

pstmt.close();
con.close();
sc.close();
}

}
}



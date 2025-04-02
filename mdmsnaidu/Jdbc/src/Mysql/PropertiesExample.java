package Mysql;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
public class PropertiesExample {
	public static void main(String[] args) {
		Properties pro = new Properties();
        // pro.setProperty("Driver","com.mysql.cj.jdbc.Driver");
		pro.setProperty("url", "jdbc:mysql://localhost:3306/Bank_Application");
		pro.setProperty("username", "root");
		pro.setProperty("password", "M1racle@123");
		try {
			FileOutputStream fo = new FileOutputStream("./property.txt");
			pro.store(fo, "Database Configuration");
			fo.close();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			FileInputStream fi = new FileInputStream("property.txt");
			pro.load(fi);
			fi.close();
              // System.out.println("Driver:  "+pro.getProperty("Driver"));
			System.out.println("url:  " + pro.getProperty("url"));
			System.out.println("username:  " + pro.getProperty("username"));
			System.out.println("password:  " + pro.getProperty("password"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
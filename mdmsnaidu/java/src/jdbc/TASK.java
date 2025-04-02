package jdbc;
import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
public class TASK {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement psd = null;
        ResultSet rs = null;
        String Driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/Task";
        String username = "root";
        String password = "M1racle@123";
        try {
            Class.forName(Driver);
            connection = DriverManager.getConnection(url, username, password);
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose the option:\n1 - HR \n2 - Trainer \n3 - Trainee \n4 - Exit");
            int n = sc.nextInt();
            sc.nextLine();
            if (n == 1) {
                System.out.println("Enter your username:");
                String uname = sc.nextLine();
                String query = "SELECT username, password FROM credentials WHERE username = ?";
                psd = connection.prepareStatement(query);
                psd.setString(1, uname);
                rs = psd.executeQuery();
                if (!rs.next()) {
                    throw new UserNotFoundException("User not found");
                }
                System.out.println("Enter your password:");
                String upass = sc.nextLine();
                if (!rs.getString("password").equals(upass)) {
                    throw new InvalidCredentialsException("Incorrect password");
                }
                System.out.println("Login Successful");
                System.out.println("Choose the option:\n1 - Trainer \n2 - Trainee");
                int t = sc.nextInt();
                sc.nextLine();
                if (t == 1) {
                    System.out.println("Choose the option:\n1 - Insert \n2 - Select \n3 - Update \n4 - Delete");
                    int u = sc.nextInt();
                    sc.nextLine();
                    if (u == 1) {
                        System.out.println("Enter the first name:");
                        String fn = sc.nextLine();
                        System.out.println("Enter the last name:");
                        String ln = sc.nextLine();
                        System.out.println("Enter the phone number:");
                        String pn = sc.nextLine();
                        System.out.println("Enter the alternative phone number:");
                        String apn = sc.nextLine();
                        String cem = fn.substring(0, 1) + ln + "@miraclesoft.com";
                        System.out.println("Enter the designation:");
                        String desg = sc.nextLine();
                        System.out.println("Enter the salary:");
                        double sal = sc.nextDouble();
                        sc.nextLine();
                        Calendar c = Calendar.getInstance();
                        String un = fn.substring(0, 2) + ln.substring(ln.length() - 2) + pn.substring(pn.length() - 4);
                        String pss = desg.substring(0, 2) + fn.substring(0, 2) + ln.substring(0, 2) + pn.substring(0, 2) +
                                c.get(Calendar.DAY_OF_MONTH) + c.get(Calendar.HOUR) + c.get(Calendar.MINUTE);
                        String insertEmp = "INSERT INTO registerEmployee (firstName, lastName, phno, alternativephnum, cemail, designation, salary) VALUES (?,?,?,?,?,?,?)";
                        psd = connection.prepareStatement(insertEmp, Statement.RETURN_GENERATED_KEYS);
                        psd.setString(1, fn);
                        psd.setString(2, ln);
                        psd.setString(3, pn);
                        psd.setString(4, apn);
                        psd.setString(5, cem);
                        psd.setString(6, desg);
                        psd.setDouble(7, sal);
                        int res = psd.executeUpdate();
                        rs = psd.getGeneratedKeys();
                        int eid = 0;
                        if (rs.next()) {
                            eid = rs.getInt(1);
                        }
                        if (res > 0) {
                            String insertCred = "INSERT INTO credentials (eid, username, password) VALUES (?, ?, ?)";
                            psd = connection.prepareStatement(insertCred);
                            psd.setInt(1, eid);
                            psd.setString(2, un);
                            psd.setString(3, pss);
                            res = psd.executeUpdate();
                            if (res > 0) {
                                System.out.println("Credentials generated successfully.");
                            } else {
                                System.out.println("Failed to generate credentials.");
                            }
                        }
                    }
                }
            }
        } catch (UserNotFoundException | InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (psd != null) psd.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}

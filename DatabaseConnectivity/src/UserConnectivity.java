import java.sql.*;
import java.util.Scanner;

public class UserConnectivity {

    public static Connection cn;
    public static Statement smt;
    public static final String mdriver = "com.mysql.cj.jdbc.Driver";
    public static final String uname = "root";
    public static final String pswd = "admin";
    public static final String myDB = "jdbc:mysql://localhost:3306/employee	";

    public static Connection getConnection() {
        try {
            Class.forName(mdriver);
            cn = DriverManager.getConnection(myDB, uname, pswd);
            System.out.println("Connectivity done......");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }

    public static void insertData() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the id : ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.println("Enter the username : ");
            String username = sc.nextLine();

            System.out.println("Enter the email : ");
            String email = sc.nextLine();

            String query = "INSERT INTO employee1 (id, username, email) VALUES (" + id + ", '" + username + "', '" + email + "')";

            smt = cn.createStatement();
            smt.executeUpdate(query);
            System.out.println("Data inserted successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
        insertData();
    }
}

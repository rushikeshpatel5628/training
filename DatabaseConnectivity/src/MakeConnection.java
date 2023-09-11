import java.sql.*;

public class MakeConnection {
    public static Connection cn;
    public static Statement smt;
    public static ResultSet rSet;
    public static final String mdriver = "com.mysql.cj.jdbc.Driver";
    public static final String uname = "root";
    public static final String pswd = "admin";
    public static final String myDB = "jdbc:mysql://localhost:3306/employee";

    public static Connection getConnection() {
        try {
            Class.forName(mdriver);
            cn = DriverManager.getConnection(myDB, uname, pswd);
            System.out.println("Connectivity done......");
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }

    public static void insertData() {
        try {
            String query = "INSERT INTO emp (id, username, email) VALUES (333, 'Ajay', 'ajay78@gmail.com')";
            smt = cn.createStatement();
            smt.executeUpdate(query);
            System.out.println("Data inserted successfully.");
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void updateData() {
        try {
            String query = "update emp set username = 'Nirjaa', email = 'nirja43@gmail.com' where id = 222";
            smt = cn.createStatement();
            smt.executeUpdate(query);
            System.out.println("Data inserted successfully.");
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void deleteData() {
    	try {
			String query = "delete from emp where id = 111";
			smt = cn.createStatement();
			smt.executeUpdate(query);
			System.out.println("One Data Deleted");
		} 
    	catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
    
    public static void fetchAll() {
    	try {
			String query = "select * from emp";
			smt = cn.createStatement();
			rSet = smt.executeQuery(query);
			
			while (rSet.next()) {
				System.out.println(rSet.getInt(1) + " " + rSet.getString(2) + " " + rSet.getString(2));
			}
		} 
    	catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
    
    

    public static void main(String[] args) {
        System.out.println(getConnection());
//        insertData();
//        updateData();
        fetchAll();
        
    }
}

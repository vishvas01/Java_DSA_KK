package adjava_ques;
import java.sql.*;

public class Q15 {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/library";
    
    static final String USER = "root";
    static final String PASS = "password";
    static Connection conn = null;
    static Statement stmt = null;
    
    public static void main(String[] args) {
        try {

            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ad", "root", "vishvas12345");
            

            stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS books " +
                         "(id INT(11) NOT NULL AUTO_INCREMENT, " +
                         " title VARCHAR(255), " +
                         " author VARCHAR(255), " +
                         " publisher VARCHAR(255), " +
                         " year INT(4), " +
                         " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            

            sql = "INSERT INTO books (title, author, publisher, year) " +
                  "VALUES ('To Kill a Mockingbird', 'Harper Lee', 'J. B. Lippincott & Co.', 1960)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO books (title, author, publisher, year) " +
                  "VALUES ('1984', 'George Orwell', 'Secker & Warburg', 1949)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO books (title, author, publisher, year) " +
                  "VALUES ('Pride and Prejudice', 'Jane Austen', 'T. Egerton', 1813)";
            stmt.executeUpdate(sql);
            System.out.println("Sample books added to the table.");
            
            // Query the books table and display the results
            sql = "SELECT * FROM books";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                int year = rs.getInt("year");
                System.out.println("ID: " + id);
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Publisher: " + publisher);
                System.out.println("Year: " + year);
                System.out.println();
            }
            
            // Close the result set, statement, and connection objects
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            } try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
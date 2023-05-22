import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "2001";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stat = conn.createStatement();) {

            // String sql = "CREATE DATABASE java";
            // stat.executeUpdate(sql);

            String useDatabase = "USE java";
            stat.executeUpdate(useDatabase);

            String createTable = "CREATE TABLE lab101 (id INT PRIMARY KEY, name VARCHAR(255))";
            stat.executeUpdate(createTable);

            String insertData = "INSERT INTO lab101 (id, name) VALUES (1, 'Alice'), (2, 'Bob')";
            stat.executeUpdate(insertData);

            System.out.println("Database and table created successfully...");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
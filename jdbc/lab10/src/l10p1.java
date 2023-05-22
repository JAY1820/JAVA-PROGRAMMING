import java.sql.*;
import java.util.*;

public class l10p1 {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Connection con = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/java";
            String username = "root";
            String password = "2001";
            con = DriverManager.getConnection(url, username, password);
    
            // Insert a new employee
            String insertQuery = "INSERT INTO emp(empid, name, dept, salary) VALUES (?, ?, ?, ?)";
            System.out.println("************* Insert Employee Details ************");
            PreparedStatement pstInsert = con.prepareStatement(insertQuery);
            System.out.print("Enter Employee Id: ");
            int id = sc.nextInt();
            pstInsert.setInt(1, id);
            System.out.print("Enter Employee Name: ");
            String name = sc1.nextLine();
            pstInsert.setString(2, name);
            System.out.print("Enter Employee Department: ");
            String dept = sc1.nextLine();
            pstInsert.setString(3, dept);
            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();
            pstInsert.setDouble(4, salary);
            int rowsInserted = pstInsert.executeUpdate();
            System.out.println("Inserted row " + rowsInserted);
            System.out.println("**********************************");

            // Update an employee's name
            String updateQuery = "UPDATE emp SET name = ? WHERE empid = ?";
            System.out.println("************ Update Employee Details ***********");
            PreparedStatement pstUpdate = con.prepareStatement(updateQuery);
            System.out.print("Enter Id of employee to update: ");
            int idToUpdate = sc.nextInt();
            pstUpdate.setInt(2, idToUpdate);
            System.out.print("Enter new name: ");
            String newName = sc1.nextLine();
            pstUpdate.setString(1, newName);
            int rowsUpdated = pstUpdate.executeUpdate();
            System.out.println("Updated row " + rowsUpdated);
            System.out.println("**********************************************");

            // Delete an employee
            String deleteQuery = "DELETE FROM emp WHERE empid = ?";
            System.out.println("************* Delete Employee Details ************");
            PreparedStatement pstDelete = con.prepareStatement(deleteQuery);
            System.out.print("Enter Id of employee to delete: ");
            int idToDelete = sc.nextInt();
            pstDelete.setInt(1, idToDelete);
            int rowsDeleted = pstDelete.executeUpdate();
            System.out.println("Deleted row " + rowsDeleted);
            System.out.println("****************************************************");

            // Find employee with maximum salary
            Statement stmtMax = con.createStatement();
            String maxSalaryQuery = "SELECT * FROM emp WHERE salary = (SELECT MAX(salary) FROM emp)";
            ResultSet maxSalaryResult = stmtMax.executeQuery(maxSalaryQuery);
            System.out.println("************* Employee Details [Maximum Salary] ************");
            System.out.println("EmpId\tName\tDepartment\tSalary ");
            while (maxSalaryResult.next()) {
                System.out.printf("%5d\t%10s\t%10s\t%10f\n", maxSalaryResult.getInt(1),
                        maxSalaryResult.getString(2), maxSalaryResult.getString(3), maxSalaryResult.getDouble(4));
            }
            System.out.println("***********************************************************");

            // Find employee with minimum salary
            Statement stmtMin = con.createStatement();
            String minSalaryQuery = "SELECT * FROM emp WHERE salary = (SELECT MIN(salary) FROM emp)";
            ResultSet minSalaryResult = stmtMin.executeQuery(minSalaryQuery);
            System.out.println("************* Employee Details [Maximum Salary] ************");
            System.out.println("EmpId\tName\tDepartment\tSalary ");
            while (minSalaryResult.next()) {
                System.out.printf("%5d\t%10s\t%10s\t%10f\n", minSalaryResult.getInt(1),
                        maxSalaryResult.getString(2), minSalaryResult.getString(3), minSalaryResult.getDouble(4));
            }
            System.out.println("***********************************************************");
            Statement stmtDis = con.createStatement();
            String disQuery = "SELECT * FROM emp ORDER BY dept ASC";
            ResultSet disResult = stmtDis.executeQuery(disQuery);
            System.out.println("************ Employee Details [Group By Department] ********");
            System.out.println("EmpId\tName\tDepartment\tSalary ");
            while (disResult.next()) {
                System.out.printf("%5d\t%10s\t%10s\t%10f\n", disResult.getInt(1),
                        disResult.getString(2), disResult.getString(3), disResult.getDouble(4));
            }
            System.out.println("*************************************************************");
        } catch (Exception ex) {
            System.out.println("Error on data select" + ex);
            ex.printStackTrace();
        } finally {
            // Close the connection
            if (con != null) {
                con.close();
            }
        }
    }
}
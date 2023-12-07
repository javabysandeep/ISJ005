package jdbc.crudOperations;

import java.sql.*;

public class Demo4Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // step 1 : load the driver class in the memory and register it with the DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2 : get the connection
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "delete from course where course_name like '%Python%'";
        Statement stmt = connection.createStatement();

        //insert, update, delete --> executeUpdate
        int result = stmt.executeUpdate(query);
        System.out.println("Courses deleted " + result);
        connection.close();
    }
}

package jdbc.crudOperations;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.StatementImpl;

import java.sql.*;

public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //steps to connect to the database from java program

        // step 1 : load the driver class in the memory and register it with the DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");


        //step 2 : get the connection
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "select * from course";
        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery(query);
        while (resultSet.next()) {
            System.out.print(resultSet.getInt("id") + "\t");
            System.out.print(resultSet.getString("course_name") + "\t");
            System.out.print(resultSet.getInt("price") + "\t");
            System.out.println();
        }
        connection.close();
    }
}

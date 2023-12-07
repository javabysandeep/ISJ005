package jdbc.crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6Update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // step 1 : load the driver class in the memory and register it with the DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2 : get the connection
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "update course set price=99999 where id=22";
        Statement stmt = connection.createStatement();
        //insert, update, delete --> executeUpdate
        int result = stmt.executeUpdate(query);
        System.out.println("Course Updated " + result);
        connection.close();
    }
}

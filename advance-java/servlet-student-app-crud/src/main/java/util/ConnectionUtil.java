package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/it_shaala";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("issue in loading the class");
        } catch (SQLException e) {
            System.out.println("issue while connection");
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}

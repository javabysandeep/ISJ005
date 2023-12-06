package jdbc;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //insert the data in the database
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from course");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + "\t" +
                    resultSet.getString("course_name") + "\t" +
                    resultSet.getInt("price"));
        }
        connection.close();
    }
}

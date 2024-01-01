package jdbc.metadata;

import jdbc.ConnectionUtil;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query = "select * from course";
        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery(query);
        ResultSetMetaData metaData = resultSet.getMetaData();
        DatabaseMetaData databaseMetaData = connection.getMetaData();
      /*  while (resultSet.next()) {
            System.out.print(resultSet.getInt("id") + "\t");
            System.out.print(resultSet.getString("course_name") + "\t");
            System.out.print(resultSet.getInt("price") + "\t");
            System.out.println();
        }*/
        System.out.println("Metadata about the result");
        System.out.println("Column count : " + metaData.getColumnCount());
        System.out.println("Column data type: " + metaData.getColumnType(1));
        System.out.println("Schema Name : "+metaData.getSchemaName(2));


        connection.close();
    }
}

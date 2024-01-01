package jdbc.metadata;

import jdbc.ConnectionUtil;

import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        DatabaseMetaData metaData = connection.getMetaData();
        System.out.println("username "+metaData.getUserName());
        System.out.println("maximum row size "+ metaData.getMaxRowSize());

        connection.close();
    }
}

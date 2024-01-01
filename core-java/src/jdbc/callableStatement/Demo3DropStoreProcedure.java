package jdbc.callableStatement;

import jdbc.ConnectionUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo3DropStoreProcedure {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query = "drop procedure bulk_insert";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        connection.close();
        System.out.println("stored procedure dropped");
    }
}

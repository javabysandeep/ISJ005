package jdbc.callableStatement;

import jdbc.ConnectionUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo1CreateStoreProcedure {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query = "create\n" +
                "    definer = root@localhost procedure bulk_insert()\n" +
                "BEGIN\n" +
                "\n" +
                "insert into course values(101,'Python Core',50);\n" +
                "insert into course values(102,'Python Advance',50);\n" +
                "insert into course values(103,'Python Framework',50);\n" +
                "insert into course values(104,'Python with DSA',50);\n" +
                "insert into course values(105,'Python with IDE',50);\n" +
                "insert into course values(106,'Python Django',50);\n" +
                "\n" +
                "END;";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        connection.close();
        System.out.println("stored procedure created");
    }
}

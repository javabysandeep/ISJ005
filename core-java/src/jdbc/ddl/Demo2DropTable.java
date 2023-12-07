package jdbc.ddl;

import jdbc.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2DropTable {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();

        //DL commands : create table, drop table, alter table :--> execute();
        String query = "drop table bacchan";
        boolean execute = statement.execute(query);
        connection.close();
        System.out.println("table dropped");
    }
}

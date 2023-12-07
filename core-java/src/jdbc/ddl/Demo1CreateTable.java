package jdbc.ddl;

import jdbc.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1CreateTable {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();

        //DL commands : create table, drop table, alter table :--> execute();
        String query = "create table bacchan(id int, name varchar(50))";
        boolean execute = statement.execute(query);
        connection.close();
        System.out.println("table created");
    }
}

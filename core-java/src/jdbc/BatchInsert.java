package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();
        String query1 = "insert into course(id, course_name, price) values(2001,'Ethical Hacking',399)";
        String query2 = "insert into course(id, course_name, price) values(2002,'cyber security',399)";
        String query3 = "insert into course(id, course_name, price) values(2003,'Chat GPT',399)";

        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);

        int[] result = statement.executeBatch();

        System.out.println("Records inserted " + result);

        connection.close();


    }
}

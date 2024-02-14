package com.itshaala.util;

import com.itshaala.constants.DbConstants;
import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.itshaala.constants.DbConstants.*;

public class JdbcConfiguration {
    @Getter
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("unable to driver class");
        } catch (SQLException e) {
            System.out.println("unable to get connection");
        }
    }
}

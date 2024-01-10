package com.itshaala.util;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.itshaala.util.Constant.*;

public class ConnectionUtil {

    @Getter
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USERNAME, MYSQL_DB_PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("issue in loading or getting the connection");
        }
    }


}

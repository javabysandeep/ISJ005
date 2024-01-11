package com.itshaala.util;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.itshaala.constant.DbConstants.*;

public class ConnectionUtil {

    @Getter
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("driver not found");
        } catch (SQLException exception) {
            System.out.println("issue in connection");
        }
    }
}

package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This is the connection factory for the application
 * It establishes the application's connection to the database
 */
public class ConnectionFactory {

    private static final String url = "jdbc:postgresql://practicedatabase.cyujpfbj7s2c.us-east-2.rds.amazonaws.com:5432/postgres?currentSchema=project1";
    private static final String userName = "postgres";
    private static final String password = System.getenv("dbPassword");
    private static Connection connection;

    public static Connection getConnection(){
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;

    }
}

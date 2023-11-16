package com.hauschildt.data_access;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Dotenv dotenv = Dotenv.load();
        String db_full_driver = dotenv.get("DB_FULL_DRIVER");
        String db_connection_string = dotenv.get("DB_CONNECTION_STRING");
        String db_user = dotenv.get("DB_USER");
        String db_password  = dotenv.get("DB_PASSWORD");
        Class.forName(db_full_driver);
        Connection connection = DriverManager.getConnection(db_connection_string, db_user, db_password);
        if(connection.isValid(2)) {
            System.out.println("Connection successful");
            return connection;
        }
        else {
            System.out.println("Connection failed");
            return null;
        }
    }

    public static void showError(SQLException e) {
        while (e != null) {
            System.out.println("SQLState:  " + e.getSQLState()); // Vendor specific state codes, errors codes, and messages
            System.out.println("Error Code:" + e.getErrorCode());
            System.out.println("Message:   " + e.getMessage());
            Throwable t = e.getCause();
            while (t != null) {
                System.out.println("Cause:" + t);
                t = t.getCause();
            }
            e = e.getNextException();
        }
    }
}

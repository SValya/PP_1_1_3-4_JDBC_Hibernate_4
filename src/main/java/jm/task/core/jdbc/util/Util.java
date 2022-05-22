package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String dbDRIVER = "com.mysql.cj.jdbc.Driver";
    private static String dbURL = "jdbc:mysql://localhost:3306/base";
    private static String dbUsername = "root";
    private static String dbPassword = "1234";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(dbDRIVER);
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}

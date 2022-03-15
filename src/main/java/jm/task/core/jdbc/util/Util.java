package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/Connection1?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Paka1337";
    private final static String DRIVER = "com.mysql.jdbc.Driver";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Подключение к БД прошло успешно");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Не удалось подключиться к БД");

        } return connection;
    }

}


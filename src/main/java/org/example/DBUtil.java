package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author liufuze
 * @date 2024/7/22 下午3:22
 */
public class DBUtil {
    private static final String url = "jdbc:mysql://localhost:3306/nuist?characterEncoding=utf8";
    private static final String user = "root";
    private static final String password = "a12345";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}

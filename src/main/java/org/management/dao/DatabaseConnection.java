package org.management.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection createConnection() throws SQLException {
        String url = "";
        String user = "";
        String password = "";

        Connection conn = null;
        conn = DriverManager.getConnection(url,user,password);
        return conn;
    }

}

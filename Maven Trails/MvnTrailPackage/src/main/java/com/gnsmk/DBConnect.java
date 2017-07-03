package com.gnsmk;

import java.sql.*;

public class DBConnect {

    Connection con = null;
    String driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/jdbcpractice";

    void runQuery(String name, String age, String phone) {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        String sql = "INSERT INTO `studentdetials`(`name`, `age`, `phone`) VALUES ('" + name + "'," + age + "," + phone
                + ")";

        if (con != null) {
            System.out.println("Database Connection Is Established");
            try {
                if (con.prepareStatement(sql).executeUpdate() > 0) {
                    System.out.println("Data Inserted into database table Successfully");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("error occoured while connecting to DB");
        }
    }
}
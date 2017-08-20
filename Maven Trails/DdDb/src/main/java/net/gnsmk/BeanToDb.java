package net.gnsmk;

import java.io.*;
import java.sql.*;
import java.util.*;

class BeanToDb {
    static Connection con = null;
    static boolean isSuccess = true;
    static String query = "INSERT INTO jdbcpractice.studentdetials (name, age, phone) VALUES ";

    public static void main(String[] args) throws IOException {

        List<Employee> emps = new CSV2Bean().getList();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/jdbcpractice", "root", "");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (con != null) {
            System.out.println("Connection Established");
            try {
                for (Employee e : emps) {
                    query += "(\"" + e.name + "\", \"" + e.age + "\", \"" + e.phone + "\"), ";
                }
                isSuccess = (con.prepareStatement(query = query.substring(0, query.length() - 2) + ";").executeUpdate() > 0);
                System.out.println((query));
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                if (con != null) {
                    try {
                        con.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
            if (isSuccess) {
                System.out.println("Insertion Success");
            } else {
                System.out.println("Insertion Failed");
            }
        }
    }
}
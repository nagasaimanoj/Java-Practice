package com.dd.db;

import com.opencsv.CSVReader;
import java.io.*;
import java.util.*;
import java.sql.*;

class ReadLine {

    static Connection con = null;
    static boolean isSuccess = false;
    static String sql = "";

    public static void main(String[] args) throws IOException {

        CSVReader reader = new CSVReader(new FileReader("users.csv"), ',');

        ArrayList<Employee> emps = new ArrayList<Employee>();

        String[] record = null;

        while ((record = reader.readNext()) != null) {
            emps.add(new Employee().setPhone(record[2]).setName(record[0]).setAge(record[1]));
        }

        System.out.println(emps);

        while (emps.size() != 0) {
            sql += "INSERT INTO `studentdetials`(`name`, `age`, `phone`) VALUES ('" + emps.get(0).name + "',"
                    + emps.get(0).age + "," + emps.get(0).phone + ");";
            emps.remove(0);
        }
        reader.close();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://10.100.8.134:3306/jdbcpractice", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (con != null) {
            try {
                isSuccess = (con.prepareStatement(sql).executeUpdate() > 0);
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
        }
    }
}
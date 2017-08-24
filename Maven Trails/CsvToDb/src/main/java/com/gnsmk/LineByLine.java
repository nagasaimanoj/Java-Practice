package com.gnsmk;

<<<<<<< HEAD
class LineByLine {
    static boolean isSuccess = false;
    static String sql = "";

    public static void main(String[] args) throws java.io.IOException {

        com.opencsv.CSVReader reader = new com.opencsv.CSVReader(new java.io.FileReader("dd.csv"), ',');
        java.util.ArrayList<Employee> emps = new java.util.ArrayList<Employee>();
        String[] record = null;

        while ((record = reader.readNext()) != null) {
            emps.add(new Employee().setId(record[0]).setName(record[1]).setAge(record[2]));
        }

        System.out.println(emps);

        while (emps.size() != 0) {
            sql += "INSERT INTO `studentdetials`(`name`, `age`, `phone`) VALUES ('" + emps.get(0).id + "',"
                    + emps.get(0).name + "," + emps.get(0).age + ");";
=======
import com.opencsv.CSVReader;

import java.io.*;
import java.sql.*;
import java.util.*;

class LineByLine {

    static Connection con = null;
    static boolean isSuccess = false;
    static String sql = "";

    public static void main(String[] args) throws IOException {

        CSVReader reader = new CSVReader(new FileReader("dd.csv"), ',');

        ArrayList<Employee> emps = new ArrayList<Employee>();

        String[] record = null;

        while ((record = reader.readNext()) != null) {
            emps.add(new Employee().setId(record[0]).setName(record[1]).setAge(record[2]));
        }

        System.out.println(emps);


        while (emps.size() != 0) {
            sql += "INSERT INTO `studentdetials`(`name`, `age`, `phone`) VALUES ('" + emps.get(0).id + "'," + emps.get(0).name + "," + emps.get(0).age
                    + ");";
>>>>>>> 33b134ffcfd6c8fe383a437bb67eba133b4b2029
            emps.remove(0);
        }
        reader.close();

        try {
            Class.forName("com.mysql.jdbc.Driver");
<<<<<<< HEAD
            java.sql.Connection con = java.sql.DriverManager
                    .getConnection("jdbc:mysql://10.100.8.134:3306/jdbcpractice", "root", "");
            if (con != null) {
                try {
                    isSuccess = (con.prepareStatement(sql).executeUpdate() > 0);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (con != null) {
                        try {
                            con.close();
                        } catch (java.sql.SQLException e) {
                            e.printStackTrace();
                        }
=======
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
>>>>>>> 33b134ffcfd6c8fe383a437bb67eba133b4b2029
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package com.gnsmk;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

public class Hello {
    public static void main(String args[]) {
        System.out.println(
                "select an option : \n1. All Employees\n2. Employees in Team\n3. Employees joined in a month\n4. Top 5 High paid\n5. Range wise Salary\n");
        Scanner sc = new Scanner(System.in);
        String query = "";
        switch (sc.nextInt()) {
        case 1:
            query = "Select * from employee";
            break;
        case 2:
            query = "Select * from employee e, team t WHERE e.team = t.id AND t.id = 2";
            break;
        case 3:
            query = "Select * from employee order by salary desc limit 5";
            break;
        case 4:
            query = "Select * from employee WHERE MONTH(doj)='10'";
            break;
        case 5:
            System.out.println("select a range : \n1. 10,000 to 25,000\n2. 25,000 to 50,000\n3. 50,000 to 1,00,000\n");
            switch (sc.nextInt()) {
            case 1:
                query = "select * from employee where salary between 10000 and 25000";
                break;
            case 2:
                query = "select * from employee where salary between 25000 and 50000";
                break;
            case 3:
                query = "select * from employee where salary between 50000 and 100000";
                break;
            default:
                System.out.println("are u kidding bro..?");
                break;
            }
            break;
        default:
            System.out.println("INVALID OPTION SELECTED");
            break;
        }
        Connection conn = DbConnect.getDbConnect();
        try {
            // ResultSet resultSet = conn.createStatement().executeQuery(query);
            ResultSet resultSet = stream(conn, query).map(t -> t).collect(Collectors.toList());
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t"
                        + resultSet.getString(3) + "\t" + resultSet.getString(4) + "\t" + resultSet.getString(5) + "\t"
                        + resultSet.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
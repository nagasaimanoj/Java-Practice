package com.gnsmk;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

public class Hello {
    static List<EmployeeTable> li = new ArrayList<EmployeeTable>();

    public static void main(String args[]) {
        System.out.println("select an option : \n" + "1. All Employees\n" + "2. Employees in Team\n"
                + "3. Employees joined in a month\n" + "4. Top 5 High paid\n" + "5. Range wise Salary\n");
        Scanner sc = new Scanner(System.in);
        Connection conn = DbConnect.getDbConnect();
        try {
            ResultSet resultSet = conn.createStatement().executeQuery("Select * from employee");

            while (resultSet.next()) {
                li.add(new EmployeeTable().setId(resultSet.getString(1)).setName(resultSet.getString(2))
                        .setSalary(resultSet.getInt(3)).setTeam(resultSet.getInt(4)).setDate(resultSet.getString(5))
                        .setMailId(resultSet.getString(6)));
            }

            switch (sc.nextInt()) {
            case 1:
                li.stream().collect(Collectors.toList()).forEach(System.out::println);
                break;
            case 2:
                System.out.println("select an option to display : ");
                switch (sc.nextInt()) {
                case 1:
                    li.stream().filter(n -> n.getTeam() == 1).collect(Collectors.toList()).forEach(System.out::println);
                    break;
                case 2:
                    li.stream().filter(n -> n.getTeam() == 2).collect(Collectors.toList()).forEach(System.out::println);
                    break;
                case 3:
                    li.stream().filter(n -> n.getTeam() == 3).collect(Collectors.toList()).forEach(System.out::println);
                    break;

                case 4:
                    li.stream().filter(n -> n.getTeam() == 4).collect(Collectors.toList()).forEach(System.out::println);
                    break;
                default:
                    System.out.println("INVALID OPTION SELECTED");
                }
            case 3:
                //Employees joined in a month
                break;
            case 4:
                li.stream().sorted(Comparator.comparing(EmployeeTable::getSalary).reversed()).limit(1)
                        .collect(Collectors.toList()).forEach(System.out::println);
                break;
            case 5:
                System.out.println("select a range : \n" + "1. 10,000 to 25,000\n" + "2. 25,000 to 50,000\n"
                        + "3. 50,000 to 1,00,000\n");
                switch (sc.nextInt()) {
                case 1:
                    li.stream().filter(n -> (n.getSalary() > 10000 && n.getSalary() < 25000))
                            .collect(Collectors.toList()).forEach(System.out::println);
                    break;
                case 2:
                    li.stream().filter(n -> (n.getSalary() > 25000 && n.getSalary() < 50000))
                            .collect(Collectors.toList()).forEach(System.out::println);
                    break;
                case 3:
                    li.stream().filter(n -> (n.getSalary() > 50000 && n.getSalary() < 100000))
                            .collect(Collectors.toList()).forEach(System.out::println);
                    break;
                default:
                    System.out.println("INVALID OPTION SELECTED");
                }
                break;
            default:
                System.out.println("INVALID OPTION SELECTED");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
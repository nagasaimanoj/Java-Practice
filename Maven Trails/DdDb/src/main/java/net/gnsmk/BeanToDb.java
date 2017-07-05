package net.gnsmk;

import java.io.*;
import java.sql.*;
import java.util.*;

class BeanToDb {
	static Connection con = null;
	static boolean isSuccess = true;
	static String query = "";

	public static void main(String[] args) throws IOException {

		CSVToBean cbn = new CSVToBean();
		List<Employee> emps = new ArrayList<Employee>();

		emps = cbn.getList();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/jdbcpractice", "root", "");
		} catch (ClassNotFoundException exception) {
			exception.printStackTrace();
		} catch (SQLException exception) {
			exception.printStackTrace();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		if (con != null) {
			System.out.println("Connection Established");
			try {
				for (Employee e : emps) {
					query = "INSERT INTO `jdbcpractice`.`studentdetials` (`name`, `age`, `phone`) VALUES (\"" + e.name
							+ "\", \"" + e.age + "\", \"" + e.phone + "\");";
					isSuccess &= (con.prepareStatement(query).executeUpdate() > 0);
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (Exception exception) {
						exception.printStackTrace();
					}
				}
			}
			if(isSuccess){
				System.out.println("Insertion Success");
			}else{
				System.out.println("Insertion Failed");
			}
		}
	}
}
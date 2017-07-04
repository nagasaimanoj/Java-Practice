package com.gnsmk;

import java.io.*;
import java.util.*;

import com.opencsv.CSVReader;

class Csv1 {
	DBConnect dbc = new DBConnect();

	String name, age, phone;

	public Csv1 setPhone(String temp) {
		phone = temp;
		return this;
	}

	public Csv1 setName(String temp) {
		name = temp;
		return this;
	}

	public Csv1 setAge(String temp) {
		age = temp;
		return this;
	}

	@Override
	public String toString() {
		dbc.runQuery(name, age, phone);
		return "{" + name + "::" + age + "::" + phone + "}";
	}
}

class LineByLine {

	public static void main(String[] args) throws IOException {

		CSVReader reader = new CSVReader(new FileReader("users.csv"), ',');

		List<Csv1> emps = new ArrayList<Csv1>();

		String[] record = null;

		while ((record = reader.readNext()) != null) {
			emps.add(new Csv1().setPhone(record[2]).setName(record[0]).setAge(record[1]));
		}

		System.out.println(emps);

		reader.close();
	}
}
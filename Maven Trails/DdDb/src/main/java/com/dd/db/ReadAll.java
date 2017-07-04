package com.dd.db;

import com.opencsv.CSVReader;
import java.io.*;
import java.util.*;

public class ReadAll {

	public static void main(String[] args) throws IOException {
		CSVReader reader = new CSVReader(new FileReader("dd.csv"), ',');

		List<Employee> emps = new ArrayList<Employee>();

		List<String[]> records = reader.readAll();

		Iterator<String[]> iterator = records.iterator();

		while (iterator.hasNext()) {
			String[] record = iterator.next();
			emps.add(new Employee().setPhone(record[2]).setName(record[0]).setAge(record[1]));
		}

		System.out.println(emps);

		reader.close();
	}
}
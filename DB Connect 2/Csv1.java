package com.gnsmk.dbconnect;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
public class Csv1 {

	private String id;
	private String name;
	private String age;
	private String country;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "{" + id + "::" + name + "::" + age + "::" + country + "}";
	}
}

public class OpenCSVReaderLineByLineExample {

	public static void main(String[] args) throws IOException {

		CSVReader reader = new CSVReader(new FileReader("users.csv"), ',');

		List<Csv1> emps = new ArrayList<Csv1>();

		// read line by line
		String[] record = null;

		while ((record = reader.readNext()) != null) {
			Csv1 emp = new Csv1();
			emp.setId(record[0]);
			emp.setName(record[1]);
			emp.setAge(record[2]);
			emp.setCountry(record[3]);
			emps.add(emp);
		}

		System.out.println(emps);
		
		reader.close();
	}

}
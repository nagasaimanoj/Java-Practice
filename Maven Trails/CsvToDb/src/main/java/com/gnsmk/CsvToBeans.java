package com.gnsmk;

public class CsvToBeans {
	public static void main(String[] args) throws java.io.IOException {

		com.opencsv.bean.ColumnPositionMappingStrategy<Employee> beanStrategy = new com.opencsv.bean.ColumnPositionMappingStrategy<Employee>();
		beanStrategy.setType(Employee.class);
		beanStrategy.setColumnMapping(new String[] { "id", "name", "age", "country" });

		System.out.println(new com.opencsv.bean.CsvToBean<Employee>().parse(beanStrategy,
				new com.opencsv.CSVReader(new java.io.FileReader("emps.csv"), ',')));
	}
}
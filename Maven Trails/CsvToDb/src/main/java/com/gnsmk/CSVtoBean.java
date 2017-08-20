package com.gnsmk;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;

import java.io.FileReader;
import java.io.IOException;

public class CsvToBean {

    public static void main(String[] args) throws IOException {

        CSVReader reader = new CSVReader(new FileReader("emps.csv"), ',');

        ColumnPositionMappingStrategy<Employee> beanStrategy = new ColumnPositionMappingStrategy<Employee>();
        beanStrategy.setType(Employee.class);
        beanStrategy.setColumnMapping(new String[]{"id", "name", "age", "country"});

        CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();

        List<Employee> emps = csvToBean.parse(beanStrategy, reader);

        System.out.println(emps);

    }

}

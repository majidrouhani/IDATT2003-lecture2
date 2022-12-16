package edu.ntnu.idatt2001.lectures.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleData {

    protected SimpleData() {
        throw new IllegalStateException("SimpleData class");
    }

    public static List<Person> getPersonData() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Hans Ola"));
        persons.add(new Person("Anne Antonsen"));
        return persons;
      }
    
     public static List<Employee> getEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ola Ansatt", 550000));
        employees.add(new Employee("Kristin Dahle", 650000));
        return employees;
      }
}

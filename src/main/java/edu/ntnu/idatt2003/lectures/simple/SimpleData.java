package edu.ntnu.idatt2003.lectures.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * SimpleData.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder data for applikasjonen.
 */
public class SimpleData {

    /**
     * Privat konstruktør, hindrer instansiering.
     */
    private SimpleData() {
        throw new IllegalStateException("SimpleData class");
    }

    /**
     * Metode som returnerer en liste med personer.
     *
     * @return personer
     */
    public static List<Person> getPersonData() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Hans Ola"));
        persons.add(new Person("Anne Antonsen"));
        return persons;
      }
    
      /**
       * Metode som returnerer en liste med ansatte.
       *
       * @return ansatte
       */
     public static List<Employee> getEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ola Ansatt", 550000));
        employees.add(new Employee("Kristin Dahle", 650000));
        return employees;
      }
}

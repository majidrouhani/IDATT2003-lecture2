package edu.ntnu.idatt2003.lectures.hierarchy;

import java.util.List;

import edu.ntnu.idatt2003.lectures.simple.Employee;
import edu.ntnu.idatt2003.lectures.simple.Person;
import edu.ntnu.idatt2003.lectures.simple.SimpleData;

/**
 * App.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder main-metoden for applikasjonen.
 */
public class App {

  /**
   * Main-metode som starter applikasjonen.
   *
   * @param args
   */
  public static void main(String[] args) {

    List<Person> persons = SimpleData.getPersonData();

    if (persons != null) {
      for (Person person : persons) {
        System.out.printf("Person %s", person);
      }
    }

    List<Employee> employees = SimpleData.getEmployeeData();
    if (employees != null) {
      for (Employee employee : employees) {
        System.out.printf("Employee %s", employee);
      }
    }

    List<Patient> patients = HierarchyData.getPatientData();
    if (patients != null) {
      for (Patient patient : patients) {
        System.out.printf("Patient %s", patient);
      }
    }
  }
}

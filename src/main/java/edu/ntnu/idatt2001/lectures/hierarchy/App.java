package edu.ntnu.idatt2001.lectures.hierarchy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.ntnu.idatt2001.lectures.simple.Employee;
import edu.ntnu.idatt2001.lectures.simple.Person;
import edu.ntnu.idatt2001.lectures.simple.SimpleData;

public class App {

  private static final Logger logger = Logger.getLogger(App.class.getName());

  /**
   * main.
   *
   * @param args - arguments to main
   */
  public static void main(String[] args) {

    List<Person> persons = SimpleData.getPersonData();

    if (persons != null) {
      for (Person person : persons) {
        logger.log(Level.INFO,"Person {0}", person);
      }
    }

    List<Employee> employees = SimpleData.getEmployeeData();
    if (employees != null) {
      for (Employee employee : employees) {
        logger.log(Level.INFO,"Employee {0}", employee);
      }
    }

    List<Patient> patients = HierarchyData.getPatientData();
    if (patients != null) {
      for (Patient patient : patients) {
        logger.log(Level.INFO,"Patient {0}", patient);
      }
    }
  }
}

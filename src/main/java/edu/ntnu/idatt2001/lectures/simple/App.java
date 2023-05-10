package edu.ntnu.idatt2001.lectures.simple;

import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * App.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder main-metoden for applikasjonen.
 */
public class App {

  // Logger
  private static final Logger logger = Logger.getLogger(App.class.getName());

  /**
   * Main-metode som starter applikasjonen.
   *
   * @param args
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

  }
}

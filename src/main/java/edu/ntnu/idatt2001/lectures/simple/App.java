package edu.ntnu.idatt2001.lectures.simple;

import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public class App {

  private static final Logger LOGGER = Logger.getLogger(App.class.getName());

  /**
   * main.
   *
   * @param args - arguments to main
   */
  public static void main(String[] args) {

    List<Person> persons = SimpleData.getPersonData();

    if (persons != null) {
      for (Person person : persons) {
        LOGGER.log(Level.INFO,"Person {0}", person);
      }
    }


    List<Employee> employees = SimpleData.getEmployeeData();
    if (employees != null) {
      for (Employee employee : employees) {
        LOGGER.log(Level.INFO,"Employee {0}", employee);
      }
    }

  }
}

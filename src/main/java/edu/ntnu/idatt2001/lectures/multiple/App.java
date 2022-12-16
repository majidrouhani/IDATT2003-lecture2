package edu.ntnu.idatt2001.lectures.multiple;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

  private static final Logger LOGGER = Logger.getLogger(App.class.getName());

  /**
   * main.
   *
   * @param args - arguments to main
   */
  public static void main(String[] args) {

    List<Manager> managers = MultipleData.getPatientData();
    if (managers != null) {
      for (Manager manager : managers) {
        LOGGER.log(Level.INFO,"Manager {0}", manager);
      }
    }
  }
}

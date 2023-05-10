package edu.ntnu.idatt2001.lectures.multiple;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    List<Manager> managers = MultipleData.getPatientData();
    if (managers != null) {
      for (Manager manager : managers) {
        logger.log(Level.INFO,"Manager {0}", manager);
      }
    }
  }
}

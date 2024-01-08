package edu.ntnu.idatt2003.lectures.multiple;

import java.util.List;

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

    List<Manager> managers = MultipleData.getPatientData();
    if (managers != null) {
      for (Manager manager : managers) {
        System.out.printf("Manager %s", manager);
      }
    }
  }
}

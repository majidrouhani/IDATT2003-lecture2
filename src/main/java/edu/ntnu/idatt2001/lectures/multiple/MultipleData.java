package edu.ntnu.idatt2001.lectures.multiple;

import java.util.ArrayList;
import java.util.List;

/**
 * MultipleData.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder data for applikasjonen.
 */
public class MultipleData{

  /**
   * Privat konstruktør, hindrer instansiering.
   */
  private MultipleData() {
    throw new IllegalStateException("MultipleData class");
  }

  /**
   * Metode som returnerer en liste med personer.
   *
   * @return personer
   */
  public static List<Manager> getPatientData() {
    List<Manager> managers = new ArrayList<>();
    managers.add(new Manager("Hans Ola", 650000,"Avdelingsleder"));
    managers.add(new Manager("Anne Antonsen",900000, "Konsernsjef"));
    return managers;
  }
}

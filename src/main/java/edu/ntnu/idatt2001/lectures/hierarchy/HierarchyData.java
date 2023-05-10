package edu.ntnu.idatt2001.lectures.hierarchy;

import java.util.ArrayList;
import java.util.List;

/**
 * HierarchyData.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder data for applikasjonen.
 */
public class HierarchyData{

  /**
   * Privat konstruktør, hindrer instansiering.
   */
  private HierarchyData() {
    throw new IllegalStateException("HierarchyData class");
  }

  /*
   * Metode som returnerer en liste med personer.
   * @return personer
   */
  public static List<Patient> getPatientData() {
    List<Patient> patients = new ArrayList<>();
    patients.add(new Patient("Hans Ola", "Anne Olsen"));
    patients.add(new Patient("Anne Antonsen", "Magnus Anderson"));
    return patients;
  }
}

package edu.ntnu.idatt2001.lectures.hierarchy;

import java.util.ArrayList;
import java.util.List;

public class HierarchyData{

  /**
   * 
   */
  protected HierarchyData() {
    throw new IllegalStateException("HierarchyData class");
  }

  public static List<Patient> getPatientData() {
    List<Patient> patients = new ArrayList<>();
    patients.add(new Patient("Hans Ola", "Anne Olsen"));
    patients.add(new Patient("Anne Antonsen", "Magnus Anderson"));
    return patients;
  }
}

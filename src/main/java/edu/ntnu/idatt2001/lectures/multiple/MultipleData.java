package edu.ntnu.idatt2001.lectures.multiple;

import java.util.ArrayList;
import java.util.List;

public class MultipleData{

  /**
   * 
   */
  protected MultipleData() {
    throw new IllegalStateException("MultipleData class");
  }

  public static List<Manager> getPatientData() {
    List<Manager> managers = new ArrayList<>();
    managers.add(new Manager("Hans Ola", 650000,"Avdelingsleder"));
    managers.add(new Manager("Anne Antonsen",900000, "Konsernsjef"));
    return managers;
  }
}

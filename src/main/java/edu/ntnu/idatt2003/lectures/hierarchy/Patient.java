package edu.ntnu.idatt2003.lectures.hierarchy;

import edu.ntnu.idatt2003.lectures.simple.Person;

/**
 * Patient.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som representerer en pasient.
 */
public class Patient extends Person {
  
  // fastlege
  private String gp;

  /**
   * Konstruktør:
   *
   * @param name navnet til personen
   * @param gp   fastlege
   */
  public Patient(String name, String gp) {
    super(name);
    this.setGp(gp);
  }

  /**
   * getGp() returnerer fastlege.
   *
   * @return gp
   */
  public String getGp() {
    return gp;
  }

  /**
   * setGp() setter fastlege.
   *
   * @param gp
   */
  public void setGp(String gp) {
    this.gp = gp;
  }

  @Override
  public String toString() {
    return "Patient [gp=" + gp + ", toString()=" + super.toString() + "]";
  }
}

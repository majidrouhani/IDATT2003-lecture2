package edu.ntnu.idatt2001.lectures.multiple;

import edu.ntnu.idatt2001.lectures.simple.Employee;

/**
 * Manager.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som representerer en ansatt.
 */
public class Manager extends Employee {

  // tittel til leder
  private String title;

  /**
   * Konstruktør:
   *
   * @param name   navnet til personen
   * @param salary lønn til personen
   * @param title  tittel til leder
   */
  public Manager(String name, double salary, String title) {
    super(name, salary);
    this.title = title;
  }

  /**
   * getTitle() returnerer tittel.
   *
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * setTitle() setter tittel.
   *
   * @param title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Manager [title=" + title + "]";
  }

}

package edu.ntnu.idatt2001.lectures.simple;

/**
 * Person.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som representerer en person.
 */
public class Person {
  private final String name;

  /**
   * Konstruktør:
   *
   * @param name navnet til personen
   */
  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }
}

package edu.ntnu.idatt2001.lectures.simple;

/**
 * Person...
 *
 * @author "Majid Rouhani"
 *
 */
public class Person {
  private final String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }
}

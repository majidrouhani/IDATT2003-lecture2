package edu.ntnu.idatt2003.lectures.simple;

/**
 * Employee.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som representerer en ansatt.
 */
public class Employee extends Person {
  private double salary;

  /**
   * Konstruktør:
   *
   * @param navn   navnet til personen
   * @param salary lønn til personen
   */
  public Employee(String navn, double salary) {
    super(navn);
    this.salary = salary;
  }

  /**
   * getSalary() returnerer lønn.
   *
   * @return salary
   */
  public double getSalary() {
    return salary;
  }

  /**
   * setSalary() setter lønn.
   *
   * @param salary
   */
  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [salary=" + salary + ", toString()=" + super.toString() + "]";
  }
}

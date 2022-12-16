package edu.ntnu.idatt2001.lectures.simple;

public class Employee extends Person {
  private double salary;

  public Employee(String navn, double salary) {
    super(navn);
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [salary=" + salary + ", toString()=" + super.toString() + "]";
  }
}

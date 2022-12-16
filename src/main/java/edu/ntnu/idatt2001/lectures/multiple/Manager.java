package edu.ntnu.idatt2001.lectures.multiple;

import edu.ntnu.idatt2001.lectures.simple.Employee;

public class Manager extends Employee {
  private String title;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Manager(String name, double salary, String title) {
    super(name, salary);
    this.title = title;
  }

  @Override
  public String toString() {
    return "Manager [title=" + title + "]";
  }

}

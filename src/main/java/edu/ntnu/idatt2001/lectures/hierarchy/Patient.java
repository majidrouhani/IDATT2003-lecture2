package edu.ntnu.idatt2001.lectures.hierarchy;

import edu.ntnu.idatt2001.lectures.simple.Person;

public class Patient extends Person {
  private String gp;

  public Patient(String name, String gp) {
    super(name);
    this.setGp(gp);
  }

  public String getGp() {
    return gp;
  }

  public void setGp(String gp) {
    this.gp = gp;
  }

  @Override
  public String toString() {
    return "Patient [gp=" + gp + ", toString()=" + super.toString() + "]";
  }
}

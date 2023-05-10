package edu.ntnu.idatt2001.lectures.polymorphism;

/*
 * IsoscelesTriangle.java - "Programmering i Java", 4.utgave - 2009-07-01
 * Klasse som representerer en likebenet trekant.
 */
public class IsoscelesTriangle extends Triangle {

  /**
   * Konstruktør:
   *
   * @param g lengden til grunnlinjen
   * @param s lengden til side 2 og 3
   */
  public IsoscelesTriangle(double g, double s) {
    super(g, s, s);
  }

  /**
   * {@inheritDoc}
   * calcArea: returnerer arealet til likebenet trekant.
   *
   * @return arealet til likebenet trekant
   */
  @Override
  public double calcArea() {
    double h = Math.sqrt(Math.pow(this.b, 2) - Math.pow(this.a, 2) / 4);
    return Math.round(h * this.a / 4);
  }

  @Override
  public String toString() {
    return "LikebenetTrekant [g=" + this.a + ", s=" + this.b + ", getAreal()=" + calcArea()
        + ", getOmkrets()=" + calcCircumference() + "]";
  }
}

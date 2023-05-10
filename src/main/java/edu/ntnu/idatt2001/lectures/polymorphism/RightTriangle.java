package edu.ntnu.idatt2001.lectures.polymorphism;

/**
 * RightTriangle.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som representerer en rettvinklet trekant.
 */
public class RightTriangle extends Triangle {

  /**
   * Konstruktør:
   *
   * @param g lengden til side 1
   * @param h lengden til side 2
   */
  public RightTriangle(double g, double h) {
    super(g, h, Math.sqrt(Math.pow(g, 2) + Math.pow(h, 2)));
  }

  /**
   * {@inheritDoc}
   * calcArea: returnerer arealet til rettvinklet trekant.
   *
   * @return arealet til rettvinklet trekant
   */
  @Override 
  public double calcArea() { 
    return Math.round(this.a * this.b / 2); 
  }

  @Override
  public String toString() {
    return "RettvinkletTrekant [g=" + this.a + ", h=" + this.b + ", getAreal()="
        + calcArea() + ", getOmkrets()=" + calcCircumference() + "]";
  }
}

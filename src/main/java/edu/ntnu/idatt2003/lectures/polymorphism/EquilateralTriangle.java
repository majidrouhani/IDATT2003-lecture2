package edu.ntnu.idatt2003.lectures.polymorphism;

/**
 * EquilateralTriangle.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som representerer en likesidet trekant.
 */
public class EquilateralTriangle extends Triangle {
  
  /**
   * Konstruktør:
   *
   * @param s lengden til side 1
   */
  public EquilateralTriangle(double s) {
    super(s, s, s);
  }

  /**
   * {@inheritDoc}
   * calcArea: returnerer arealet til likesidet trekant.
   *
   * @return arealet til likesidet trekant
   */
  @Override
  public double calcArea() {
    return Math.round(Math.sqrt(3) / 4 * Math.pow(this.a, 2));
  }

  @Override
  public String toString() {
    return "LikesidetTrekant [s=" + this.a + ", getAreal()=" + calcArea() + ", getOmkrets()="
        + calcCircumference() + "]";
  }

}

package edu.ntnu.idatt2001.lectures.polymorphism;

/**
 * Triangle.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som representerer en trekant.
 */
public class Triangle {
  protected final double a;
  protected final double b;
  protected final double c;

  /**
   * Konstruktør:
   *
   * @param a lengden til side 1
   * @param b lengden til side 2
   * @param c lengden til side 3
   */
  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  /**
   * calcArea: use Heron's formula
   * A = 1/4*Sqrt(l1-l2)
   * l1 = 4*a^2*b^2
   * l2 = (a^2+b^2-c^2)^2
   * 
   * @return area of triangle
   */
  public double calcArea() {
    double l1 = 4*Math.pow(a, 2)*Math.pow(b, 2);
    double l2 = Math.pow(Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 2),2);
    return Math.sqrt(l1-l2)/4;
    
  }

  /**
   * calcCircumference: returnerer omkretsen til trekanten.
   *
   * @return omkretsen til trekanten
   */
  public double calcCircumference() {
    return this.a + this.b + this.c;
  }

  @Override
  public String toString() {
    return "Trekant [side1=" + a + ", side2=" + b + ", side3=" + c + "]";
  }
}

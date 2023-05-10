package edu.ntnu.idatt2001.lectures.polymorphism;

/**
 * App.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder main-metoden for applikasjonen.
 */
public class App {

  /**
   * Main-metode som starter applikasjonen.
   *
   * @param args
   */
  public static void main(String[] args) {

    Triangle triangle = new Triangle(9, 6, 5);
    Double calcArea = triangle.calcArea();
    System.out.printf("All three sides are known: Area = %s", calcArea);

    RightTriangle rightTriangle = new RightTriangle(9, 6);
    calcArea = rightTriangle.calcArea();
    System.out.printf("Right triangle: Area = %n", calcArea);

    IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(9, 6);
    calcArea = isoscelesTriangle.calcArea();
    System.out.printf("Isosceles triangle: Area = %n", calcArea);

    EquilateralTriangle equilateralTriangle = new EquilateralTriangle(9);
    calcArea = equilateralTriangle.calcArea();
    System.out.printf("Equilateral triangle: Area = %n", calcArea);

  }
}

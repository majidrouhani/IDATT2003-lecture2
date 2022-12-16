package edu.ntnu.idatt2001.lectures.polymorphism;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

  private static final Logger LOGGER = Logger.getLogger(App.class.getName());

  /**
   * main.
   *
   * @param args - arguments to main
   */
  public static void main(String[] args) {

    Triangle triangle = new Triangle(9, 6, 5);
    Double calcArea = triangle.calcArea();
    LOGGER.log(Level.INFO,"All three sides are known: Area = {0}", calcArea);

    RightTriangle rightTriangle = new RightTriangle(9, 6);
    calcArea = rightTriangle.calcArea();
    LOGGER.log(Level.INFO,"Right triangle: Area = {0}", calcArea);

    IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(9, 6);
    calcArea = isoscelesTriangle.calcArea();
    LOGGER.log(Level.INFO,"Isosceles triangle: Area = {0}", calcArea);

    EquilateralTriangle equilateralTriangle = new EquilateralTriangle(9);
    calcArea = equilateralTriangle.calcArea();
    LOGGER.log(Level.INFO,"Equilateral triangle: Area = {0}", calcArea);

  }
}

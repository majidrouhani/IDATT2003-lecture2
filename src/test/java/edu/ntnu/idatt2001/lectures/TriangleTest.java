package edu.ntnu.idatt2001.lectures;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.ntnu.idatt2001.lectures.polymorphism.RightTriangle;
import edu.ntnu.idatt2001.lectures.polymorphism.Triangle;

/**
 * Unit test for simple App.
 */
public class TriangleTest 
{
    /**
     * 
     */
    @Test
    public void calcArea()
    {
        
        Triangle triangle = new Triangle(9, 6, 5);
        long calcArea = Math.round(triangle.calcArea()*100)/100;
        long expectedArea = Math.round(56.57/4*100)/100;
        assertEquals(expectedArea, calcArea );

        RightTriangle rightTriangle = new RightTriangle(9, 6);
        calcArea = Math.round(rightTriangle.calcArea()*100)/100;
        expectedArea = (long) 27.00;
        assertEquals(expectedArea, calcArea );


    }
}
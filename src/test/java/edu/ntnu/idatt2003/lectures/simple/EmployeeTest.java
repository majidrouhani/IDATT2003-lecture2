package edu.ntnu.idatt2003.lectures.simple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class contains unit tests for the Employee class.
 */
class EmployeeTest {

  private Employee employee;

  /**
   * Sets up the test environment before each test case.
   */
  @BeforeEach
  void setUp() {
    employee = new Employee("John Doe", 50000.0);
  }

  /**
   * Test case for the getSalary() method.
   * 
   * This test verifies that the getSalary() method returns the expected salary value.
   */
  @Test
  void testGetSalary() {
    double expectedSalary = 50000.0;
    double actualSalary = employee.getSalary();
    assertEquals(expectedSalary, actualSalary, 1e-10);
  }

  /**
   * Test case for the setSalary method.
   * It verifies that the setSalary method correctly sets the salary of an employee.
   */
  @Test
  void testSetSalary() {
    double newSalary = 60000.0;
    employee.setSalary(newSalary);
    assertEquals(newSalary, employee.getSalary(), 1e-10);
  }

  /**
   * Test case for the toString() method of the Employee class.
   * It verifies that the toString() method returns the expected string representation of the Employee object.
   */
  @Test
  void testToString() {
    String expectedString = "Employee [salary=50000.0, toString()=Person [name=John Doe]]";
    String actualString = employee.toString();
    assertEquals(expectedString, actualString);
  }
}
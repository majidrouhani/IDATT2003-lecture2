package edu.ntnu.idatt2003.lectures.simple;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SimpleDataTest {

    @Test
    void testGetPersonData() {
        List<Person> personData = SimpleData.getPersonData();

        assertNotNull(personData);
        assertEquals(2, personData.size());

        // Add more assertions to validate the data returned by the method
        // For example:
        // assertEquals("John Doe", personData.get(0).getName());
        // assertEquals(25, personData.get(0).getAge());
    }

    @Test
    void testGetEmployeeData() {
        List<Employee> employeeData = SimpleData.getEmployeeData();

        assertNotNull(employeeData);
        assertEquals(2, employeeData.size());

        // Add more assertions to validate the data returned by the method
        // For example:
        // assertEquals("Jane Smith", employeeData.get(0).getName());
        // assertEquals("Manager", employeeData.get(0).getPosition());
    }
}

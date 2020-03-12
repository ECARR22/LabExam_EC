package ie.gmit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.engine.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import org.junit.jupiter.Test*;

public class EmployeeTest {

    @BeforeEach
    void init()
    { }

    @Test
    void testConstructorSuccess() {
        Employee e1 = new Employee("Evans", "12345");
        assertEquals("Evans", e1.getName());
        assertEquals("12345", e1.getEmployeeID());
    }

    @Test
    void testConstructorFailure() {
        //Employee e1 = new Employee("Evans", "");
        assertThrows(IllegalArgumentException.class, ()-> {new Employee("Evans", "");});
        assertThrows(IllegalArgumentException.class, ()-> {new Employee("", "12345");});
    }

}

package RegistrationPortal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnrollmentTest {
    Enrollment enrollment;

    @BeforeEach
    void beforeEach() {
        enrollment = new Enrollment();
    }

    @AfterEach
    void afterEach() {
        enrollment = null;
    }

    @Test
    void enrollmentWithAFirstNameTest() {
        assertEquals("Kingsley", enrollment.firstName("Kingsley"));
    }

    @Test
    void enrollmentWithALastNameTest() {
        assertEquals("Kingsley", enrollment.lastName("Kingsley"));
    }

    @Test
    void enrollmentWithEmailTest() {
        assertEquals("Kingsleynwafor54@yahoo.com", enrollment.getEmail("Kingsleynwafor54@yahoo.com"));
    }

    @Test
    void enrollmentWithPasswordTest() {
        enrollment.setPassword("12345");
        assertEquals("12345", enrollment.getPassword());
    }

    @Test
    void enrollmentWithCoursesTest() {
//
//        assertEquals("Kingsleynwafor54@yahoo.com",enrollment.getCourse());
//    }

    }
}

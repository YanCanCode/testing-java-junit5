package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1L, "Steve", "Stevenson");

        //then
        assertAll("Test properties set",
                () -> assertEquals(person.getFirstName(), "Steve"),
                () -> assertEquals(person.getLastName(), "Stevenson"));
    }

    @Test
    void groupedAssertionsWithMessages() {

        /*
        Overloading the assertEquals method with a message to allow it to allow
        for easier troubleshooting.
         */

        //given
        Person person = new Person(1L, "Steve", "Stevenson");

        //then
        assertAll("Test properties set",
                () -> assertEquals(person.getFirstName(), "Steve", "First name failed."),
                () -> assertEquals(person.getLastName(), "Stevenson", "Last name failed."));
    }
}
package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", controller.index());
    }

    @Test
    void oupsHandler() {
        // Lambda expressions only evaluated on a test failure.
        // This is good for performance if your error message is expensive.
        assertTrue("notimplemented".equals(controller.oupsHandler()), () -> "This is some expensive" +
                "Message to build" +
                " for my test");
    }
}
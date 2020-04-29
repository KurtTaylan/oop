package com.challenge.oop.domain.model.entity.bird.chicken;

import com.challenge.oop.domain.model.exception.BusinessException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RoasterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }


    @Test
    void sing() {
        Roaster roaster = new Roaster();
        roaster.sing();
        assertTrue(outContent.toString().contains("Cock-a-doodle-doo"));
    }

    @Test
    void walk() {
        Roaster chicken = new Roaster();
        chicken.walk();
        assertTrue(outContent.toString().contains("I am walking"));
    }

    @Test
    void fly() {
        Roaster chicken = new Roaster();

        BusinessException thrown = assertThrows(
                BusinessException.class,
                chicken::fly,
                "Expected fly() to throw, but it didn't"
        );

        assertTrue(thrown.getMessage().contains("Cannot fly"));
    }
}
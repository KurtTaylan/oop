package com.challenge.oop.domain.model.entity.bird;

import com.challenge.oop.domain.model.exception.BusinessException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChickenTest {

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
    void walk() {
        Chicken chicken = new Chicken();
        chicken.walk();
        assertTrue(outContent.toString().contains("I am walking"));
    }

    @Test
    void fly() {
        Chicken chicken = new Chicken();

        BusinessException thrown = assertThrows(
                BusinessException.class,
                chicken::fly,
                "Expected fly() to throw, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Chicken cannot fly"));
    }

    @Test
    void sing() {
        Chicken chicken = new Chicken();
        chicken.sing();
        assertTrue(outContent.toString().contains("Cluck, cluck"));
    }
}
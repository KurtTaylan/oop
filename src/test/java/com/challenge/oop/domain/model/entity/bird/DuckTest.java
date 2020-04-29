package com.challenge.oop.domain.model.entity.bird;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DuckTest {

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
        Duck duck = new Duck();
        duck.walk();
        assertTrue(outContent.toString().contains("I am walking"));
    }

    @Test
    void fly() {
        Duck duck = new Duck();
        duck.fly();
        assertTrue(outContent.toString().contains("I am flying"));
    }

    @Test
    void sing() {
        Duck duck = new Duck();
        duck.sing();
        assertTrue(outContent.toString().contains("Quack, quack"));
    }

    @Test
    void swim() {
        Duck duck = new Duck();
        duck.swim();
        assertTrue(outContent.toString().contains("I am swimming"));
    }
}
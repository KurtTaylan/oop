package com.challenge.oop.domain.model.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

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
    void walking() {
        Bird bird = new Bird();
        bird.walk();
        assertTrue(outContent.toString().contains("I am walking"));
    }

    @Test
    void fly() {
        Bird bird = new Bird();
        bird.fly();
        assertTrue(outContent.toString().contains("I am flying"));
    }

    @Test
    void sing() {
        Bird bird = new Bird();
        bird.sing();
        assertTrue(outContent.toString().contains("I am singing"));
    }
}
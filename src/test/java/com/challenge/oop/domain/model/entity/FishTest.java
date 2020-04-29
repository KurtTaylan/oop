package com.challenge.oop.domain.model.entity;

import com.challenge.oop.domain.model.exception.BusinessException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FishTest {

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
    void swim() {
        Fish fish = new Fish();
        fish.swim();
        assertTrue(outContent.toString().contains("I am swimming"));
    }

    @Test
    void cannotWalk() {
        Fish fish = new Fish();

        BusinessException thrown = assertThrows(
                BusinessException.class,
                fish::walk,
                "Expected walk() to throw, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Cannot walk"));
    }
}
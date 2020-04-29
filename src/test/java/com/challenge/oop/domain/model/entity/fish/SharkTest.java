package com.challenge.oop.domain.model.entity.fish;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SharkTest {

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
    void eatFish() {
        Shark shark = new Shark();
        shark.eatFish(new ClownFish());
        assertTrue(outContent.toString().contains("I ate the fish: com.challenge.oop.domain.model.entity.fish.ClownFish"));
    }
}
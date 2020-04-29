package com.challenge.oop.domain.model.entity.bird;

import com.challenge.oop.domain.model.entity.bird.chicken.Roaster;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ParrotTest {

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
    void singWithRoaster() {
        Parrot parrotWithRoaster = Parrot.buildWith(new Roaster());
        parrotWithRoaster.sing();
        assertTrue(outContent.toString().contains("Cock-a-doodle-doo"));
    }

    @Test
    void singWithDuck() {
        Parrot parrotWithDuck = Parrot.buildWith(new Duck());
        parrotWithDuck.sing();
        assertTrue(outContent.toString().contains("Quack, quack"));
    }
}
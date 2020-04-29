package com.challenge.oop.domain.model.entity.behaviour;

public interface Walkable {
    default void walk() {
        System.out.println("I am walking");
    }
}

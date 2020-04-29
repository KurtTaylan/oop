package com.challenge.oop.domain.model.entity.behaviour;

public interface Flyable {
    default void fly() {
        System.out.println("I am flying");
    }
}

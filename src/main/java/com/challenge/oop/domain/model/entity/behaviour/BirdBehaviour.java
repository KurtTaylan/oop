package com.challenge.oop.domain.model.entity.behaviour;

public interface BirdBehaviour extends AnimalBehaviour {

    default void fly() {
        System.out.println("I am flying");
    }

    default void sing() {
        System.out.println("I am singing");
    }
}

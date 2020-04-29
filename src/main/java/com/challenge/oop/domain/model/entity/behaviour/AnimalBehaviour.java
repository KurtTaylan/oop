package com.challenge.oop.domain.model.entity.behaviour;

public interface AnimalBehaviour extends SoundBehaviour {

    default void walk() {
        System.out.println("I am walking");
    }
}

package com.challenge.oop.domain.model.entity.behaviour;

public interface Swimmable {

    default void swim() {
        System.out.println("I am swimming");
    }
}

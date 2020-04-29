package com.challenge.oop.domain.model.entity.behaviour;

public interface Singable {
    default void sing() {
        System.out.println("I am singing");
    }
}

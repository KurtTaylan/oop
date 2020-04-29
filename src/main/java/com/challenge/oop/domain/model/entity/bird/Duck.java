package com.challenge.oop.domain.model.entity.bird;

import com.challenge.oop.domain.model.entity.behaviour.BirdBehaviour;

public class Duck implements BirdBehaviour {

    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

    public void swim() {
        System.out.println("I am swimming");
    }
}

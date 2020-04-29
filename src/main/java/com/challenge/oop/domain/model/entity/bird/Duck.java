package com.challenge.oop.domain.model.entity.bird;

import com.challenge.oop.domain.model.entity.Bird;

public class Duck extends Bird {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

    public void swim() {
        System.out.println("I am swimming");
    }
}

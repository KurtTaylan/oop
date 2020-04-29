package com.challenge.oop.domain.model.entity.bird;

import com.challenge.oop.domain.model.entity.Bird;
import com.challenge.oop.domain.model.entity.behaviour.Swimmable;

public class Duck extends Bird implements Swimmable {

    @Override
    public void sing() {
        System.out.println(decorateSound());
    }

    @Override
    public String decorateSound() {
        return "Quack, quack";
    }
}

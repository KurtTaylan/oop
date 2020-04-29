package com.challenge.oop.domain.model.entity.bird.chicken;

import com.challenge.oop.domain.model.entity.Bird;
import com.challenge.oop.domain.model.entity.bird.Chicken;

public class Rooster extends Bird {

    private final Chicken chicken;

    public Rooster() {
        chicken = new Chicken();
    }

    @Override
    public void fly() {
        chicken.fly();
    }

    @Override
    public void sing() {
        chicken.sing(decorateSound());
    }

    @Override
    public String decorateSound() {
        return "Cock-a-doodle-doo";
    }
}

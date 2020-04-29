package com.challenge.oop.domain.model.entity.bird.chicken;

import com.challenge.oop.domain.model.entity.behaviour.ChickenBehaviour;

public class Roaster implements ChickenBehaviour {

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}

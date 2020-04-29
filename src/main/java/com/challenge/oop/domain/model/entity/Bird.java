package com.challenge.oop.domain.model.entity;

import com.challenge.oop.domain.model.entity.behaviour.BirdBehaviour;

public class Bird implements BirdBehaviour {

    @Override
    public String decorateSound() {
        return "I am singing";
    }
}

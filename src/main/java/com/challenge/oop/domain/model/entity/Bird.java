package com.challenge.oop.domain.model.entity;

import com.challenge.oop.domain.model.entity.behaviour.Flyable;
import com.challenge.oop.domain.model.entity.behaviour.Singable;
import com.challenge.oop.domain.model.entity.behaviour.SoundDecorator;
import com.challenge.oop.domain.model.entity.behaviour.Walkable;

public class Bird extends Animal implements Walkable, Flyable, Singable, SoundDecorator {

    @Override
    public String decorateSound() {
        return "I am singing";
    }
}

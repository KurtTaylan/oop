package com.challenge.oop.domain.model.entity.behaviour;

public interface SoundDecorator {

    default String decorateSound() {
        return "";
    };
}

package com.challenge.oop.domain.model.entity.behaviour;

public interface SoundBehaviour {

    default String decorateSound() {
        return "";
    };
}

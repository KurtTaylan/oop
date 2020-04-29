package com.challenge.oop.domain.model.entity.bird;

import com.challenge.oop.domain.model.entity.behaviour.BirdBehaviour;
import com.challenge.oop.domain.model.entity.behaviour.SoundBehaviour;

public class Parrot implements BirdBehaviour, SoundBehaviour {

    private SoundBehaviour soundBehaviour;

    private Parrot() {
    }

    private Parrot(SoundBehaviour soundBehaviour) {
        this.soundBehaviour = soundBehaviour;
    }

    public static Parrot buildWith(SoundBehaviour soundBehaviour) {
        return new Parrot(soundBehaviour);
    }

    @Override
    public void sing() {
        System.out.println(soundBehaviour.decorateSound());
    }
}

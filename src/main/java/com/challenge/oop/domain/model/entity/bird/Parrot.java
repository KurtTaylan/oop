package com.challenge.oop.domain.model.entity.bird;

import com.challenge.oop.domain.model.entity.Bird;
import com.challenge.oop.domain.model.entity.behaviour.SoundDecorator;

public class Parrot extends Bird implements SoundDecorator {

    private final SoundDecorator soundDecorator;

    private Parrot(SoundDecorator soundDecorator) {
        this.soundDecorator = soundDecorator;
    }

    public static Parrot buildWith(SoundDecorator soundDecorator) {
        return new Parrot(soundDecorator);
    }

    @Override
    public void sing() {
        System.out.println(soundDecorator.decorateSound());
    }
}

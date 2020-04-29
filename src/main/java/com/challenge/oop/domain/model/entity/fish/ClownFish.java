package com.challenge.oop.domain.model.entity.fish;

import com.challenge.oop.domain.model.entity.Fish;

public class ClownFish extends Fish {

    private final static String SIZE = "small";
    private final static String COLOR = "orange";

    public void makeJoke() {
        System.out.println("I am joking");
    }
}

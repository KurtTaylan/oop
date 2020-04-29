package com.challenge.oop.domain.model.entity.fish;

import com.challenge.oop.domain.model.entity.Fish;

public class Shark extends Fish {

    private final static String SIZE = "large";
    private final static String COLOR = "grey";

    public void eatFish(Fish fish) {
        System.out.println("I ate the fish: " + fish.getClass().getName());
    }
}

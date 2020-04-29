package com.challenge.oop.domain.model.entity.behaviour;

import com.challenge.oop.domain.model.exception.BusinessException;

public interface FishBehaviour extends AnimalBehaviour {

    @Override
    default void walk() {
        throw new BusinessException("Cannot walk");
    }

    default void swim() {
        System.out.println("I am swimming");
    }
}

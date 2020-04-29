package com.challenge.oop.domain.model.entity.behaviour;

import com.challenge.oop.domain.model.exception.BusinessException;

public interface ChickenBehaviour extends BirdBehaviour {

    @Override
    default void fly() {
        throw new BusinessException("Cannot fly");
    }

    @Override
    default void sing() {
        System.out.println("Cluck, cluck");
    }
}

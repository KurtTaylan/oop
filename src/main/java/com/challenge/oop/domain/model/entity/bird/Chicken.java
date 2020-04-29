package com.challenge.oop.domain.model.entity.bird;

import com.challenge.oop.domain.model.entity.Bird;
import com.challenge.oop.domain.model.exception.BusinessException;

public class Chicken extends Bird {

    @Override
    public void fly() {
        throw new BusinessException("Chicken cannot fly");
    }

    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}

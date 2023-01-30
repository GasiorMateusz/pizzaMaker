package com.codecool.converter;

import org.springframework.stereotype.Component;

@Component
public class PizzaMaker {

    private final Stove stove;

    public PizzaMaker(Stove stove) {
        this.stove = stove;
    }

    public void makePizza(){
        stove.bake();
    }
}

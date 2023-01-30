package com.codecool.converter;

public class NormalStove implements Stove{

    @Override
    public void bake() {
        System.out.println("Baked using electricity");
    }
}

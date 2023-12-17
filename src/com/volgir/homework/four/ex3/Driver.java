package com.volgir.homework.four.ex3;

public class Driver extends Human implements SoundMaker {
    private final String sound = "Я водитель.";

    @Override
    public String makeSound() {
        return String.format("%s", sound);
    }
}

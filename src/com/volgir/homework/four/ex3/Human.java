package com.volgir.homework.four.ex3;

public class Human implements SoundMaker {
    private final String sound = "Я человек.";

    @Override
    public String makeSound() {
        return sound;
    }
}

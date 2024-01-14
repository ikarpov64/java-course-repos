package com.volgir.homework.module1.four.ex3;

public class Bird implements SoundMaker {
    private final String sound = "Чирик.";

    @Override
    public String makeSound() {
        return sound;
    }
}

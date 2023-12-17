package com.volgir.homework.four.ex3;

public class Builder extends Human implements SoundMaker {
    private final String sound = "Я строитель.";

    @Override
    public String makeSound() {
        return String.format("%s %s", sound, super.makeSound());
    }
}

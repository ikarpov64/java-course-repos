package com.volgir.homework.third.ex2.components;

public class Mainboard {
    private final String name;
    private final int width;
    private final int length;
    private final int height;


    public Mainboard(String name, int width, int length, int height) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Плата: %s, размеры (ШхДхВ): %sx%sx%s", name, width, length, height);
    }
}

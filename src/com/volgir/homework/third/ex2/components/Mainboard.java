package com.volgir.homework.third.ex2.components;

public class Mainboard {
    private final String name;
    private final String size;

    public Mainboard(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("Плата: %s, размеры: %s", name, size);
    }
}

package com.volgir.homework.third.ex2.components;

public class Os {
    private final String os;

    public Os(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return String.format("Система - %s", os);
    }
}

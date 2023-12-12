package com.volgir.homework.third.ex2.components;

public class Cam {
    private final int zoom;
    private final boolean hasFlash;

    public Cam(int zoom, boolean hasFlash) {
        this.zoom = zoom;
        this.hasFlash = hasFlash;
    }

    @Override
    public String toString() {
        return String.format("Камера: %sx zoom. Вспышка %s",
                zoom,
                hasFlash ? "имеется" : "отсутствует");
    }
}

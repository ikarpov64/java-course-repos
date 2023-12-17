package com.volgir.homework.four.ex1.transport;

public class Car extends Transport {
    private final boolean hasCruise;

    public Car(boolean isClear, double width, double height, double length, boolean hasCruise) {
        super(isClear, width, height, length);
        this.hasCruise = hasCruise;
    }

    public boolean isHasCruise() {
        return hasCruise;
    }

}

package com.volgir.homework.module1.four.ex1.transport;

public class Bus extends Transport {
    private final int maxPassengerCount;

    public Bus(boolean isClear, double width, double height, double length, int maxPassengerCount) {
        super(isClear, width, height, length);
        this.maxPassengerCount = maxPassengerCount;
    }

    public int getMaxPassengerCount() {
        return maxPassengerCount;
    }
}

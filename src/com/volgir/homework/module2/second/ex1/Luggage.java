package com.volgir.homework.module2.second.ex1;

public class Luggage {
    private final String flightNumber;

    public Luggage(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Luggage{" +
                "flightNumber='" + flightNumber + '\'' +
                '}';
    }
}

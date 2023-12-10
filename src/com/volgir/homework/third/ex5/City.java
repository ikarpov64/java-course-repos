package com.volgir.homework.third.ex5;

import java.util.Arrays;

public final class City {

    private final String cityName;
    public final House[] houses;

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = houses;
    }

    public void renameHouse(House house, String newName, int newNumber) {
        house.setNumberOfHouse(newNumber);
        house.setStreetName(newName);
    }

    @Override
    public String toString() {
        return String.format("г.%s. Список улиц:\n" + Arrays.toString(houses), cityName);
    }
}

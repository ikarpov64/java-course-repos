package com.volgir.homework.third.ex5;

import java.util.Arrays;

public final class City {

    private final String cityName;
    private final House[] houses;

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = houses;
    }

    public House[] getHouses() {
        return duplicateArray();
    }

    private House[] duplicateArray() {
        House[] newHouses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            newHouses[i] = new House(houses[i]);
        }
        return newHouses;
    }

    @Override
    public String toString() {
        return String.format("г.%s. Список улиц:\n" + Arrays.toString(houses), cityName);
    }
}

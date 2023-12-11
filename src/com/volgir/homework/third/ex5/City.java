package com.volgir.homework.third.ex5;

import java.util.Arrays;

public final class City {

    private final String cityName;
    private final House[] houses;

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = houses;
    }

    public House[] getHouse() {
        House[] newHouses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            newHouses[i] = new House(houses[i]);
        }
        return newHouses;
    }

    public House[] getHouses() {
        return replaceArrayOfHouses();
    }

    private House[] replaceArrayOfHouses() {
        House[] replacedArrayOfHouses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            replacedArrayOfHouses[i] = new House(houses[i].getStreetName(), houses[i].getNumberOfHouse());
        }
        return replacedArrayOfHouses;
    }

    @Override
    public String toString() {
        return String.format("г.%s. Список улиц:\n" + Arrays.toString(houses), cityName);
    }
}

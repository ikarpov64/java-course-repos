package com.volgir.homework.third.ex5;

public class House {
    private String streetName;
    private int numberOfHouse;

    public House(String name, int numberOfHouse) {
        this.streetName = name;
        this.numberOfHouse = numberOfHouse;
    }

    public House(House house) {
        streetName = house.streetName;
        numberOfHouse = house.numberOfHouse;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public String toString() {
        return String.format("ул.%s, д.%s", streetName, numberOfHouse);
    }
}

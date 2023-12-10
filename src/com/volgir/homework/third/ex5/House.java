package com.volgir.homework.third.ex5;

public class House {
    private String streetName;
    private int numberOfHouse;

    public House(String name, int numberOfHouse) {
        this.streetName = name;
        this.numberOfHouse = numberOfHouse;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
        //System.out.println("Нельзя изменить название улицы.");
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
        //System.out.println("Нельзя изменить номер дома.");
    }

    @Override
    public String toString() {
        return String.format("ул.%s, д.%s", streetName, numberOfHouse);
    }
}

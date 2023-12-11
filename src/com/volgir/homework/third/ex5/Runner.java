package com.volgir.homework.third.ex5;

public class Runner {

    public static void main(String[] args) {
        House house1 = new House("Ленина", 4);
        House house2 = new House("Революционная", 1);

        City myCity = new City("Вольск", new House[] {house1, house2});

        House[] sds = myCity.getHouse();
        System.out.println(myCity);

        myCity.getHouses()[0].setStreetName("12312");
        myCity.getHouses()[0].setNumberOfHouse(44);

        System.out.println(myCity);

    }
}

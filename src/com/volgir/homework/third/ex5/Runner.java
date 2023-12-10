package com.volgir.homework.third.ex5;

public class Runner {

    public static void main(String[] args) {
        House house1 = new House("Ленина", 4);
        House house2 = new House("Революционная", 1);
//        System.out.println(house1);
//        house1.setNumberOfHouse(3);
//        System.out.println(house1);
        City myCity = new City("Вольск", new House[] {house1, house2});
        System.out.println(myCity);
        myCity.renameHouse(myCity.houses[0], "Ярославская", 10);
        System.out.println(myCity);



    }
}

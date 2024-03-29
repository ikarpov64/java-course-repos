package com.volgir.homework.module1.second.shop;

public class Runner {
    public static void main(String[] args) {

        Item hummer = new Item("Молоток", 1000);
        Item screwdriver = new Item("Отвертка", 50);
        Item notebook = new Item("Тетрадь", 30);
        Item pen = new Item("Ручка", 10);

        Worker vasiliy = new Worker("Василий", 30, true, new Item[]{hummer, screwdriver});
        Worker maryana = new Worker("Марьяна", 25, false, new Item[]{notebook, pen});

        Shop myShop = new Shop(new Worker[]{vasiliy, maryana});
        myShop.informationAboutWorkers();
        myShop.workersBoasting();
    }
}

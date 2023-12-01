package com.volgir.homework.second.shop;

public class Runner {
    public static void main(String[] args) {

        Item hummer = new Item("Молоток", 1000);
        Item screwdriver = new Item("Отвертка", 50);
        Item notebook = new Item("Тетрадь", 30);
        Item pen = new Item("Ручка", 10);

        Worker vasiliy = new Worker("Василий", 30, "М", new Object[]{hummer, screwdriver});
        Worker maryana = new Worker("Марьяна", 25, "Ж", new Object[]{notebook, pen});

        Shop pyatorochka = new Shop(new Object[]{vasiliy, maryana});
        pyatorochka.informationAboutWorkers();
        vasiliy.boasting();
        maryana.boasting();
    }
}

package com.volgir.homework.second.shop;

public class Worker {

    String name;
    int age;
    String gender;

    Item[] items;

    public Worker(String name, int age, String gender, Item[] items) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.items = items;
    }

    public void boasting() {
        for (Item item : this.items) {
            System.out.printf("%s: смотрите какая у меня вещь - %s%n", this.name, item.name);
        }
    }
}

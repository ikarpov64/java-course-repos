package com.volgir.homework.second.shop;

public class Worker {

    String name;
    int age;
    String gender;
    Boolean isMale;
    Item[] items;

    public Worker(String name, int age, Boolean isMale, Item[] items) {
        this.name = name;
        this.age = age;
        this.items = items;
        this.isMale = isMale;
    }

    public void boasting() {
        for (Item item : this.items) {
            System.out.printf("%s: смотрите какая у меня вещь - %s%n", this.name, item.name);
        }
    }

    public String getMale() {
        if (isMale) {
            return "мужчина";
        }
        return "женщина";
    }
}

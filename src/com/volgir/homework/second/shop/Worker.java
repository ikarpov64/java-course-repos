package com.volgir.homework.second.shop;

public class Worker {

    private String name;
    private final int age;
    private final Boolean isMale;
    private Item[] items;

    public Worker(String name, int age, Boolean isMale, Item[] items) {
        this.name = name;
        this.age = age;
        this.items = items;
        this.isMale = isMale;
    }

    public void boasting() {
        for (Item item : this.items) {
            System.out.printf("%s: смотрите какая у меня вещь - %s%n", this.name, item.getName());
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Item[] getItems() {
        return items;
    }

    public String getMale() {
        return isMale ? "мужчина" : "женщина";
//        if (isMale) {
//            return "мужчина";
//        }
//        return "женщина";
    }
}

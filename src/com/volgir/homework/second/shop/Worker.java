package com.volgir.homework.second.shop;

public class Worker {

    String name;
    int age;
    String gender;

    Object[] items;

    public Worker(String name, int age, String gender, Object[] items) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.items = items;
    }

    public void boasting() {
        for (Object item : this.items) {
            System.out.println(this.name + ": смотрите какая у меня вещь - " + ((Item)item).name);
        }
    }
}

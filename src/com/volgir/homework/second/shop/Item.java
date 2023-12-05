package com.volgir.homework.second.shop;

public class Item {

    String name;
    double weight;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + ", вес=" + weight;
    }
}

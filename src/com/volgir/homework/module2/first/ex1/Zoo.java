package com.volgir.homework.module2.first.ex1;

public class Zoo <T extends Animal, V extends Animal, K extends Animal> {
    private T animal1;
    private V animal2;
    private K animal3;

    public Zoo(T animal1, V animal2, K animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public T getAnimal1() {
        return animal1;
    }

    public V getAnimal2() {
        return animal2;
    }

    public K getAnimal3() {
        return animal3;
    }
}

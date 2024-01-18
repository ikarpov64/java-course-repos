package com.volgir.homework.module2.first.ex1;

public class Runner {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Bird bird = new Bird();

        Zoo<Tiger, Bird, Dog> zoo = new Zoo<>(tiger, bird, dog);
        zoo.getTiger().roar();
        zoo.getBird().fly();
        zoo.getDog().bark();
    }
}

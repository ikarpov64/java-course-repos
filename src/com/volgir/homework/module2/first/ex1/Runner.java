package com.volgir.homework.module2.first.ex1;

public class Runner {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Bird bird = new Bird();

        Zoo<Tiger, Dog, Bird> zoo = new Zoo<>(tiger, dog, bird);
        zoo.getAnimal1().roar();
        zoo.getAnimal2().bark();
        zoo.getAnimal3().fly();
    }
}

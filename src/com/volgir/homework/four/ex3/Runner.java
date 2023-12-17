package com.volgir.homework.four.ex3;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
        Builder builder = new Builder();
        Driver driver = new Driver();
        Bird bird = new Bird();

        SoundMaker[] soundMakers = {human, builder, driver, bird};

        for (SoundMaker soundMaker : soundMakers) {
            System.out.println(soundMaker.makeSound());
        }
    }
}

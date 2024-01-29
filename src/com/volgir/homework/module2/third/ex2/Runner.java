package com.volgir.homework.module2.third.ex2;

import com.volgir.homework.module2.third.ex2.fruits.Apple;
import com.volgir.homework.module2.third.ex2.fruits.Apricot;

public class Runner {
    public static void main(String[] args) {
        Garden appleGarden = () -> new Apple();
        Garden apricotGarden = () -> new Apricot();

        System.out.println(appleGarden.growFruit());
        System.out.println(apricotGarden.growFruit());
    }
}

package com.volgir.homework.third.ex2;

import com.volgir.homework.third.ex2.components.Cam;
import com.volgir.homework.third.ex2.components.Mainboard;
import com.volgir.homework.third.ex2.components.Os;


public class Runner {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("15");
        Samsung samsung = new Samsung("Galaxy");

        System.out.println(iphone);
        System.out.println(samsung);
        Factory myFactory = new Factory();
        myFactory.buildPhone(iphone);
        myFactory.buildPhone(samsung);
        System.out.println(iphone);
        System.out.println(samsung);
    }
}

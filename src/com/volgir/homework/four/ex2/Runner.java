package com.volgir.homework.four.ex2;

import java.sql.Array;

public class Runner {
    public static void main(String[] args) {

        Flyable[] flyables = {
            new Duck(false), new Duck(true),
            new Plane(10), new Plane(-1)};


        for (Flyable duck : flyables) {
            try {
                duck.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

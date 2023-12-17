package com.volgir.homework.four.ex2;

import java.sql.Array;

public class Runner {
    public static void main(String[] args) {

        Duck[] ducks = {new Duck(false), new Duck(true)};
        Plane[] planes = {new Plane(10), new Plane(-1)};

        for (Duck duck : ducks) {
            try {
                duck.fly();
            } catch (FlyException e) {
                System.out.println("Ошибка: утка ранена");
            }
        }

        for (Plane plane : planes) {
            try {
                plane.fly();
            } catch (FlyException e) {
                System.out.println("Ошибка: пассажиров в самолете меньше 0");
            }
        }
    }
}

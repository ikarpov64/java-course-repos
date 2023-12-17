package com.volgir.homework.four.ex1;

import com.volgir.homework.four.ex1.carwash.Carwash;
import com.volgir.homework.four.ex1.transport.Bus;
import com.volgir.homework.four.ex1.transport.Car;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(false, 1.8, 2, 5, true);
        Bus bus = new Bus(false, 2.3, 2, 12, 25);

        System.out.println(car);
        int washingCost = Carwash.washTransport(car);
        System.out.println(washingCost);
    }
}

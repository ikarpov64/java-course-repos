package com.volgir.homework.four.ex1;

import com.volgir.homework.four.ex1.carwash.Carwash;
import com.volgir.homework.four.ex1.transport.Bus;
import com.volgir.homework.four.ex1.transport.Car;
import com.volgir.homework.four.ex1.transport.Transport;

public class Runner {
    public static void main(String[] args) {
        int busCount = 6;
        int carCount = 4;

        Transport[] transports = new Transport[busCount + carCount];
        for (int i = 0; i < busCount; i++) {
            transports[i] = new Bus(false, 2.3, 2, 12, 25);
        }
        for (int i = 0; i < carCount; i++) {
            transports[i + busCount] = new Car(false, 1.8, 2, 5, true);
        }

        int washingCost = Carwash.washTransport(transports);
        System.out.println(washingCost);
    }
}

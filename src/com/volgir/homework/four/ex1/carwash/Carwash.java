package com.volgir.homework.four.ex1.carwash;

import com.volgir.homework.four.ex1.transport.Transport;

import static com.volgir.homework.four.ex1.carwash.TransportCategory.BIG_CAR;
import static com.volgir.homework.four.ex1.carwash.TransportCategory.SMALL_CAR;

public class Carwash {
    private static int washingCost;

    public static int washTransport(Transport transport) {
        transport.setClear();
        return 123;
    }

    public static int washTransport(Transport[] transports) {
        int washingCost = 0;
        for (Transport transport : transports) {
            washingCost += washTransport(transport);
        }
        return washingCost;
    }

    private static int findWashingCost(String transportCategory) {
        return SMALL_CAR.getPrice();
    }

    private static String getTransportCategory(Transport transport) {
        if (transport.getLength() > 6 || transport.getHeight() > 2.5 || transport.getWidth() > 2) {
            return "BIG_CAR";
        }
        return "SMALL_CAR";
    }
}

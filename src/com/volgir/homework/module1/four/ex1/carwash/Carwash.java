package com.volgir.homework.module1.four.ex1.carwash;

import com.volgir.homework.module1.four.ex1.transport.Transport;

public class Carwash {
//    private static int washingCost;

    public static int washTransport(Transport transport) {
        String category = getTransportCategory(transport);
        transport.setClean();
        return category.equals("SMALL_CAR")
                ? WashTariffs.SMALL_CAR.getPrice() : WashTariffs.BIG_CAR.getPrice();
    }

    public static int washTransport(Transport[] transports) {
        int washingCost = 0;
        for (Transport transport : transports) {
            washingCost += washTransport(transport);
        }
        return washingCost;
    }

    private static String getTransportCategory(Transport transport) {
        if (transport.getLength() > 6 || transport.getHeight() > 2.5 || transport.getWidth() > 2) {
            return "BIG_CAR";
        }
        return "SMALL_CAR";
    }
}

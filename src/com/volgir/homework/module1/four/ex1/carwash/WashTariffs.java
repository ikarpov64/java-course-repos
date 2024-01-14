package com.volgir.homework.module1.four.ex1.carwash;

public enum WashTariffs {
    BIG_CAR(4000), SMALL_CAR(2000);

    private final int price;

    WashTariffs(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

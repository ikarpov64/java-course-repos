package com.volgir.homework.third.ex2;

public class Iphone extends Phone {

    public Iphone(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return String.format("%s: %s; %s; %s.",
                model,
                mainboard != null ? mainboard : "Плата не установлена",
                os != null ? os : "ОС не установлена",
                cam != null ? cam : "Камера не установлена");
    }
}

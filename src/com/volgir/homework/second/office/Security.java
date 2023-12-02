package com.volgir.homework.second.office;

public class Security {
    String employeePosition = "Охранник";
    String name;

    public Security(String name) {
        this.name = name;
    }

    public void advanceRequest() {
        System.out.printf("%s: Хочу получить аванс!%n", employeePosition);
    }
}

package com.volgir.homework.module1.second.office;

public class Security {
    private final String employeePosition = "Охранник";
    private String name;

    public Security(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void advanceRequest() {
        System.out.printf("%s: Хочу получить аванс!%n", employeePosition);
    }
}

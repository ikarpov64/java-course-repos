package com.volgir.homework.second.office;

public class Manager {
    private String employeePosition = "Менеджер";
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void scream() {
        System.out.printf("%s: Я ничего не успеваю, помогите!%n", employeePosition);
    }
}

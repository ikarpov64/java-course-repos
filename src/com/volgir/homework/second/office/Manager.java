package com.volgir.homework.second.office;

public class Manager {
    String employeePosition = "Менеджер";
    String name;

    public Manager(String name) {
        this.name = name;
    }

    public void scream() {
        System.out.printf("%s: Я ничего не успеваю, помогите!%n", employeePosition);
    }
}

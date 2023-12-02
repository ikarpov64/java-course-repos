package com.volgir.homework.second.office;

public class Chief {
    String employeePosition = "Шеф";
    String name;

    public Chief(String name) {
        this.name = name;
    }

    public void pushTheManager(String name) {
        System.out.printf("%s: %s быстрее!%n", employeePosition, name);
    }
}

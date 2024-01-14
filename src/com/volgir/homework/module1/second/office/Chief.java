package com.volgir.homework.module1.second.office;

public class Chief {
    private final String employeePosition = "Шеф";
    private String name;

    public Chief(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void pushTheManager(String name) {
        System.out.printf("%s: %s быстрее!%n", employeePosition, name);
    }
}

package com.volgir.homework.second.office;

public class Chief {
    String name;

    public Chief(String name) {
        this.name = name;
    }

    public void pushTheManager(String name) {
        System.out.printf("%s быстрее!%n", name);
    }
}

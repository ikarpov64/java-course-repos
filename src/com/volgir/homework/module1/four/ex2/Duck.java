package com.volgir.homework.module1.four.ex2;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Ошибка: Утка ранена");
        }
        System.out.println("Утка летит");
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }
}

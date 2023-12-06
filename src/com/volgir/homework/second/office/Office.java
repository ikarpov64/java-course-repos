package com.volgir.homework.second.office;

public class Office {
    private Chief chief;
    private Manager manager;
    private Secretary secretary;
    private Security security;

    public Office(Chief chief, Manager manager, Secretary secretary, Security security) {
        this.chief = chief;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    public void workingDay() {
        chief.pushTheManager(manager.getName());
        manager.scream();
        security.advanceRequest();
        secretary.calmDown(chief.getName(), manager.getName(), security.getName());
    }
}

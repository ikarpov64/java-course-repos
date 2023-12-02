package com.volgir.homework.second.office;

public class Office {
    Chief chief;
    Manager manager;
    Secretary secretary;
    Security security;

    public Office(Chief chief, Manager manager, Secretary secretary, Security security) {
        this.chief = chief;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    public void workingDay() {
        chief.pushTheManager(manager.name);
        manager.scream();
        security.advanceRequest();
        secretary.calmDown(chief.name, manager.name, security.name);
    }
}

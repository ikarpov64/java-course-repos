package com.volgir.homework.second.office;

public class Office {

    public void workingDay(Chief chief, Manager manager, Secretary secretary, Security security) {
        chief.pushTheManager(manager.name);
        manager.scream();
        security.advanceRequest();
        secretary.calmDown(chief.name, manager.name, security.name);
    }
}

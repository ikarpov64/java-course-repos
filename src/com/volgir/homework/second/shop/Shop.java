package com.volgir.homework.second.shop;

import java.util.Arrays;

public class Shop {

    private Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void informationAboutWorkers() {
        for (Worker worker : this.workers) {
            System.out.printf("%s: %s лет, %s. Список вещей: %s%n",
                    worker.getName(), worker.getAge(), worker.getMale(),
                    Arrays.toString(worker.getItems()));
        }
    }

    public void workersBoasting() {
        for (Worker worker : this.workers) {
            worker.boasting();
        }
    }
}

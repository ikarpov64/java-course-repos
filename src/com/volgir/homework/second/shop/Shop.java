package com.volgir.homework.second.shop;

import java.util.Arrays;
import java.util.Objects;

public class Shop {

    Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void informationAboutWorkers() {
        for (Worker worker : this.workers) {
            System.out.printf("%s: %s лет, %s. Список вещей: %s%n",
                    worker.name, worker.age, worker.getMale(), Arrays.toString(worker.items));
        }
    }

    public void workersBoasting() {
        for (Worker worker : this.workers) {
            worker.boasting();
        }
    }
}

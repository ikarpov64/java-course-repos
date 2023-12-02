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

            String[] itemList = new String[worker.items.length];
            for (int itemIndex = 0; itemIndex < worker.items.length; itemIndex++) {
                itemList[itemIndex] = worker.items[itemIndex].name;
            }

            System.out.printf("%s: %s лет, %s. Список вещей: %s%n",
                    worker.name, worker.age, worker.gender, Arrays.toString(itemList));

        }
    }
}

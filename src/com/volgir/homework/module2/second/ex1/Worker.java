package com.volgir.homework.module2.second.ex1;

import java.util.Queue;

public class Worker {
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public void throwBagWithScream(Queue<Luggage> luggageQueue) {
        Luggage luggage  = luggageQueue.poll();
        if (luggage != null) {
            System.out.printf("%s: Мужики, кидаю чемодан - %s.\n", name, luggage);
        }
    }
}

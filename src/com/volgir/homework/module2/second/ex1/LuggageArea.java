package com.volgir.homework.module2.second.ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LuggageArea {
    private static final int LUGGAGE_COUNT = 20;
    private static final int WORKERS_COUNT = 3;
    private Worker[] workers = new Worker[WORKERS_COUNT];
    private Queue<Luggage> luggageQueue = new LinkedList<>();

    public LuggageArea(Worker[] workers) {
        this.workers = workers;
    }

    public void planeArrival(String flightNumber) {
        for (int i = 0; i < LUGGAGE_COUNT; i++) {
            luggageQueue.add(new Luggage(flightNumber));
        }
    }

    public void unloadLuggageArea() {
        while (!luggageQueue.isEmpty()) {
            for (Worker worker : workers) {
                worker.throwBagWithScream(luggageQueue); // Работник обрабатывает багаж
            }
        }
    }
}

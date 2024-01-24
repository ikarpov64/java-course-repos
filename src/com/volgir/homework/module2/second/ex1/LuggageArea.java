package com.volgir.homework.module2.second.ex1;

import java.util.LinkedList;
import java.util.Queue;

public class LuggageArea {
    private static final int LUGGAGE_SIZE = 20;
    private Worker[] workers;
    private Queue<Luggage> luggageQueue = new LinkedList<>();

    public LuggageArea(Worker[] workers) {
        this.workers = workers;
    }

    public void planeArrival(String flightNumber) {
        for (int i = 0; i < LUGGAGE_SIZE; i++) {
            luggageQueue.add(new Luggage(flightNumber));
        }
    }

    public void unloadLuggageArea() {
        while (!luggageQueue.isEmpty()) {
            unloadLuggage();
        }
    }

    private void unloadLuggage() {
        for (Worker worker : workers) {
            if (luggageQueue.isEmpty()) {
                return;
            }
            worker.throwBagWithScream(luggageQueue); // Работник обрабатывает багаж
        }
    }
 }

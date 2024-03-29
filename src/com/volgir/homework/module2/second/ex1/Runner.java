package com.volgir.homework.module2.second.ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 1. Задание: багажное отделение аэропорта.
 * Создать класс чемодан, атрибут: номер рейса

 * Создать класс работник. Имеет имя.
 * Имеет функцию кинуть багаж с криком. На вход набор чемоданов.
 * Работник берет один чемодан из набора чемоданов.
 * Печатает на экран: {имя работника}: Мужики, кидаю чемодан {номер рейса чемодана}.

 * Создать класс багажное отделение, атрибуты: набор чемоданов, 3 работника.
 * В классе багажное отделения есть функция: прилет самолета. На вход номер рейса.
 * В багажном отделении добавляются 20 чемоданов из этого рейса.

 * В классе багажное отделение есть функция: разгрузить багажное отделение.
 * 3 работника по очереди разгружают вещи, в том порядке, в котором происходили прилеты.

 * Создать раннер, в нем багажное отделение. Организовать два прилета SU-077, AO-222.
 * Разгрузить багажное отделение. Сначала должны выйти чемоданы su-077, потом ao-222.
 */
public class Runner {
    public static void main(String[] args) {
        Worker[] workers = {
            new Worker("Ivan"),
            new Worker("Petr"),
            new Worker("Ali")};

        LuggageArea luggageArea = new LuggageArea(workers);

        luggageArea.planeArrival("SU-077");
        luggageArea.planeArrival("AO-222");
        luggageArea.unloadLuggageArea();
    }
}

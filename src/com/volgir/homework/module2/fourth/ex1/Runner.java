package com.volgir.homework.module2.fourth.ex1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Задание №1 - Список спец номеров.
 * Создать класс машина. У машины есть номер.
 * Создать 50 машин с номерами а0[01-50]ан799 (где [01-50] - это все значения от 01 до 50)
 * Создать 50 машин с номерами к0[01-50]се178
 * Соединить машины в единый стрим
 * Машины, с номерами 04[0-9] - это спец номера (врачи)
 * оставить только те машины, которые обладают спец номерами.
 * Получить из машин номера.
 * Соединить в единую строку, с разделителем в " ," - самостоятельное изучение
 * ожидаемый финал
 * "a040ан1799, a041ан799, ... , k048се178, k049се178"
 */
public class Runner {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();
        AtomicInteger counter2 = new AtomicInteger();
        counter.set(0);
        String licensePlateTemplate1 = "а%03dан799";
        String licensePlateTemplate2 = "к%03dсе178";

        Stream<Car> carStream = Stream.generate(() -> new Car(
                String.format(licensePlateTemplate1, counter.addAndGet(1))))
                .limit(50);

        counter2.set(0);

        Stream<Car> carStream2 = Stream.generate(() -> new Car(
                String.format(licensePlateTemplate2, counter2.addAndGet(1))))
                .limit(50);

        String doctorsLicensePlate = Stream.concat(carStream, carStream2)
                .filter(car -> Integer.parseInt(car.getNumber().substring(1, 4)) >= 40
                        && Integer.parseInt(car.getNumber().substring(1, 4)) <= 50)
                .map(car -> car.getNumber())
                .collect(Collectors.joining(", "));

        System.out.println("Номера авто врачей: " + doctorsLicensePlate);
    }
}

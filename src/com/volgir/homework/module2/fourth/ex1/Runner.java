package com.volgir.homework.module2.fourth.ex1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
 * Соединить в единую строку, с разделителем в "," - самостоятельное изучение
 * ожидаемый финал
 * "a040ан1799, a041ан799, ... , k048се178, k049се178"
 */
public class Runner {
    public static void main(String[] args) {
        String licensePlateTemplate1 = "а%03dан799";
        String licensePlateTemplate2 = "к%03dсе178";
        String doctorsLicensePlatesTemplate = ".*04[0-9].*";

        Stream<Car> carStream = IntStream.range(1, 51)
                .mapToObj(i -> new Car(String.format(licensePlateTemplate1, i)));

        Stream<Car> carStream2 = IntStream.range(1, 51)
                .mapToObj(i -> new Car(String.format(licensePlateTemplate2, i)));

        String doctorsLicensePlates = Stream.concat(carStream, carStream2)
                .map(Car::getNumber)
                .filter(number -> number.matches(doctorsLicensePlatesTemplate))
                .collect(Collectors.joining(", "));

        System.out.println("Номера авто врачей: " + doctorsLicensePlates);
    }
}

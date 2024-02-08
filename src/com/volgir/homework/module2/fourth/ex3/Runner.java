package com.volgir.homework.module2.fourth.ex3;

import java.util.Comparator;
import java.util.List;

/**
 * Задание №3 - Небоскребы, небоскребы, а я...
 * Дано: Небоскреб - имя небоскреба, его высота в метрах.
 * Необходимо создать небоскребы:
 * 1 - Всемирный торговый центр 1 - 541м.
 * 2 - Шанхайская башня - 632м.
 * 3 - Бурдж-Халифа - 828м
 * 4 - Международный финансовый центр Пинань - 599м
 * 5 - Абрадж аль-Бейт - 601м
 * 6 - Всемирный центр Лотте - 555м
 * Занести данный список в List! Дважды положить бурдж халифа в лист.
 * С помощью стримов:
 * Убрать дубликаты
 * (РАЗНЫЕ СТРИМЫ)
 * Вывести только первые три небоскреба.
 * Вывести самый высокий небоскреб.
 * Вывести те небоскребы, которые выше километра.
 * Если выше нет, то вывести на экран: небоскреба выше километра - нет.
 */
public class Runner {
    public static void main(String[] args) {
        Skyscraper worldTradeCenter = new Skyscraper("Всемирный торговый центр 1", 541);
        Skyscraper shanghaiTower = new Skyscraper("Шанхайская башня", 632);
        Skyscraper burjKhalifa = new Skyscraper("Бурдж-Халифа", 828);
        Skyscraper pinganInternationalFinancialCenter =
                new Skyscraper("Международный финансовый центр Пинань", 1599);
        Skyscraper abrajAlBayt = new Skyscraper("Абрадж аль-Бейт", 1601);
        Skyscraper lotteWorldCenter = new Skyscraper("Всемирный центр Лотте", 1555);


        List<Skyscraper> skyscrapers = List.of(worldTradeCenter, shanghaiTower, burjKhalifa,
                pinganInternationalFinancialCenter, abrajAlBayt, lotteWorldCenter, burjKhalifa);

        skyscrapers.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("_________________________________");
        skyscrapers.stream()
                .max(Comparator.comparingInt(Skyscraper::getHeight))
                .ifPresent(System.out::println);

        System.out.println("_________________________________");

        skyscrapers.stream()
                .peek(skyscraper -> {
                    if (skyscraper.getHeight() > 1000) {
                        System.out.println("Небоскреб выше 1000м: " + skyscraper);
                    }
                })
                .filter(skyscraper -> skyscraper.getHeight() > 1000).findAny().orElseGet(() -> {
                    System.out.println("sdad"); return null;});


        skyscrapers.stream()
                .filter(skyscraper -> skyscraper.getHeight() > 1000)
                .peek(skyscraper -> System.out.println(skyscraper))
                .findFirst().ifPresent(System.out::println);
    }
}

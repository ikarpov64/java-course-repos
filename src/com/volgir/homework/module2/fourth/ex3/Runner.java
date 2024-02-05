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
        List<Skyscraper> skyscrapers = getSkyscrapers();

        // Убираем дубликаты, выводим первые 3 небоскреба.
        skyscrapers.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("_________________________________");

        // Выводим самый высокий небоскреб
        skyscrapers.stream()
                .max(Comparator.comparingInt(Skyscraper::getHeight))
                .ifPresent(skyscraper -> System.out.println("Самый высокий небоскреб: " + skyscraper));
        System.out.println("_________________________________");

        // Собираем строку из небоскребов выше 1км, или строка об отсутствии таких.
        String above1000m = skyscrapers.stream()
                .filter(skyscraper -> skyscraper.getHeight() > 1000)
                .map(Skyscraper::getName)
                .reduce((skyscraper, skyscraper2) -> String.format("%s, %s", skyscraper, skyscraper2))
                .orElse("Небоскреба выше километра - нет.");
        System.out.println(above1000m);
        System.out.println("_________________________________");
    }

    private static List<Skyscraper> getSkyscrapers() {
        Skyscraper worldTradeCenter = new Skyscraper("Всемирный торговый центр 1", 541);
        Skyscraper shanghaiTower = new Skyscraper("Шанхайская башня", 632);
        Skyscraper burjKhalifa = new Skyscraper("Бурдж-Халифа", 828);
        Skyscraper pinganInternationalFinancialCenter =
                new Skyscraper("Международный финансовый центр Пинань", 599);
        Skyscraper abrajAlBayt = new Skyscraper("Абрадж аль-Бейт", 601);
        Skyscraper lotteWorldCenter = new Skyscraper("Всемирный центр Лотте", 555);

        return List.of(worldTradeCenter, shanghaiTower, burjKhalifa,
                pinganInternationalFinancialCenter, abrajAlBayt, lotteWorldCenter, burjKhalifa);
    }
}

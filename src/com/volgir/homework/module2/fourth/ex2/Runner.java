package com.volgir.homework.module2.fourth.ex2;

import java.util.List;

/**
 * Задание №2 - Сколько здесь "о" ?
 * Создать набор уникальных слов: "тонь", "тополь", "боль", "рой", "стройка"
 * Внутри одного стрима:
 * Посчитать количество букв "о" в одном слове.
 * Посчитать сумму количества букв "о" во всех словах из набора.
 * Если буквы "о" есть - напечатать количество букв "о", если нет выкинуть исключение
 * ожидаемый результат:
 * 6
 */
public class Runner {
    public static void main(String[] args) {
        List<String> listOfWords = List.of("тонь", "тополь", "боль", "рой", "стройка");

        Integer letterCount = listOfWords.stream()
                .map(e -> e.length() - e.toLowerCase().replaceAll("о", "").length())
                .reduce(Integer::sum)
                .filter(e -> e != 0)
                .orElseThrow(() -> new RuntimeException("Буква 'О' отсутствует в списке слов"));

        System.out.println(letterCount);
    }
}

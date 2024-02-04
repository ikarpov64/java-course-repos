package com.volgir.homework.module2.third.ex3;

/**
 * Задание №3: Поиск пары с помощью гадания.
 * Создать функциональный интерфейс гадание, который на вход принимает аргумент любого типа,
 * на выход возвращает да/нет.
 * Создать с помощью лямбд выражений:
 * ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
 * бабку гадалку: принимает Человека(возраст,рост),
 * возвращает да - если возраст + рост больше 210, нет - если меньше или равно
 */

public class Runner {
    public static void main(String[] args) {
        Divination<String> chamomile = name -> name.length() % 2 == 0;

        Divination<Human> fortuneTeller = human -> human.getAge() + human.getHeight() > 210;

        boolean chamomileResult = chamomile.tellFortunes("Тауриэль");
        System.out.println("Результат гадания: " + chamomileResult);

        boolean fortuneTellerResult = fortuneTeller.tellFortunes(new Human(34, 180));
        System.out.println("Результат гадания: " + fortuneTellerResult);
    }
}

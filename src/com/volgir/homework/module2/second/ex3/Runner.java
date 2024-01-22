package com.volgir.homework.module2.second.ex3;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        Detail detail1 = new Detail("Пила");
        Detail detail2 = new Detail("Молоток");
        Detail detail3 = new Detail("Отвертка");

        HashMap<Detail, Integer> details = new HashMap<>();
        details.put(detail1, 1);
        details.put(detail2, 2);
        details.put(detail3, 3);

        System.out.println(details); // Вывод: {Detail{name='Пила'}=3}

        /*
        Описание метода put у HashMap: если map содержит ключ, то старое ЗНАЧЕНИЕ заменяется.
        Переопределение метода equals у объекта возвращает булево равны ли объекты (читай ключи).
        При неравных ключах - объект в map будет добавляться (независимо от хеша),
        при равных - заменять ЗНАЧЕНИЕ в уже добавленной паре ключ-значение (при условии равного хеша),
        сам ключ останется неизменным.
        */
    }
}

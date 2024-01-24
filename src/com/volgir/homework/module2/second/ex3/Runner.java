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
    }
}

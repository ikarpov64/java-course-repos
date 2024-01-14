package com.volgir.homework.module2.first.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Integer[] firstInts = {5, 2, 4};
        List<Integer> firstList = List.of(firstInts);

        Integer[] secondInts = {7, 10};
        List<Integer> secondList = List.of(secondInts);

        ArrayList<Integer> finalList = new ArrayList<>(firstList);
        finalList.addAll(secondList);
        finalList.remove(3); // удаляем элемент с индексом 3
        System.out.println(finalList.indexOf(10)); // выводим индекс элемента со значением 10
    }
}

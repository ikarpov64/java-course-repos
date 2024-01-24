package com.volgir.homework.module2.second.ex2;

import java.util.HashMap;

/**
2. Задание: Вещей много, бакет один.
Создать класс Item, атрибут - name
Переопределить у Item equals и hashcode так, чтобы при попадании в Hashmap в качестве ключа
вещи всегда попадали в один и тот же bucket.
При добавлении вещей, они не должны замещать друг друга.
Пример: создал 3 вещи: item(Яблоко), item(Банан), item(Апельсин)
 положил в Map(ключ - значение):
 item(Яблоко) - 1
 item(Банан) - 2
 item(Апельсин) - 3
 При получении значения по ключу item(Апельсин) получу корректное значение (3)
 */
public class Runner {
    public static void main(String[] args) {
        HashMap<Item, Integer> itemHashMap = new HashMap<>();
        // HashMap помещает пару ключ-значение в бакет по хешу ключа.
        // Переопределив hash у Item, таким образом, чтобы хеш был равен у всех объектов типа Item,
        // все объекты типа Item попадут в один бакет.

        itemHashMap.put(new Item("Яблоко"), 1);
        itemHashMap.put(new Item("Банан"), 2);
        itemHashMap.put(new Item("Апельсин"), 3);

        // Для получения объекта по ключу типа Item(name),
        // необходимо переопределить метод equals таким образом,
        // чтобы объекты типа Item были равны друг-другу если равны поля name.
        System.out.println(itemHashMap.get(new Item("Апельсин"))); // Вывод: "3"
    }
}

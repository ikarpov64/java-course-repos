package com.volgir.homework.module2.first.ex3;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Item> itemsList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            itemsList.add(new Item("Item" + (i + 1)));
        }
        Storage storage = new Storage();

        storage.addItems(itemsList);
        Item itemByIndex = storage.getItemByIndex(2); // Вещь со склада по индексу. Вещь удаляется.
        ArrayList<Item> evenItems = storage.evenItems(); // Список с четными вещами.
        for (Item evenItem : evenItems) {
            System.out.println(evenItem.getItemName());
        }
        storage.clearExceptLastOne(); // Удаление всех, кроме последней вещи.
    }
}

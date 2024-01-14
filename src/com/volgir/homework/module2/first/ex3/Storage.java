package com.volgir.homework.module2.first.ex3;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItems(ArrayList<Item> items) {
        this.items.addAll(items);
    }

    public ArrayList<Item> evenItems() {
        ArrayList<Item> evenItems = new ArrayList<>();
        for (int i = 0; i < this.items.size(); i++) {
            if (i % 2 != 0) {
                evenItems.add(items.get(i));
            }
        }
        return evenItems;
    }

    public Item getItemByIndex(int index) {
        if (index < items.size()) {
            Item itemByIndex = items.get(index);
            items.remove(index);
            return itemByIndex;
        } else {
            throw new IndexOutOfBoundsException("Вещи под этим номером не существует.");
        }
    }

    public void clearExceptLastOne() {
        Item lastItem = items.get(items.size() - 1);
        items.clear();
        items.add(lastItem);
    }
}

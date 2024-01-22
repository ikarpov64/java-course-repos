package com.volgir.homework.module2.second.ex2;

import java.util.Objects;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass());
    }

    public String getName() {
        return name;
    }
}

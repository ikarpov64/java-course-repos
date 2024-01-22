package com.volgir.homework.module2.second.ex3;

import java.util.Objects;

public class Detail {
    private final String name;

    public Detail(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "name='" + name + '\'' +
                '}';
    }
}

package com.volgir.homework.module2.third.ex2;

import com.volgir.homework.module2.third.ex2.fruits.Fruit;

public interface Garden<T extends Fruit> {
    T growFruit();
}

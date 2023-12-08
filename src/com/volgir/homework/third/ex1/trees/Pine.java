package com.volgir.homework.third.ex1.trees;

import com.volgir.homework.third.ex1.types_of_trees.Conifer;

public class Pine extends Conifer {
    private final boolean isLargeNeedles = false;

    public Pine(int age, boolean isLargeNeedles) {
        super(age, isLargeNeedles);
    }

    public boolean isLargeNeedles() {
        return isLargeNeedles;
    }
}

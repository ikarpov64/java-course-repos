package com.volgir.homework.third.ex1.types_of_trees;

import com.volgir.homework.third.ex1.Tree;

public abstract class Conifer extends Tree {
    protected boolean isLargeNeedles;

    public Conifer(int age, boolean isLargeNeedles) {
        super(age);
        this.isLargeNeedles = isLargeNeedles;
    }
}

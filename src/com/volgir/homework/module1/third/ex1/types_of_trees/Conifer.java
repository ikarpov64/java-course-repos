package com.volgir.homework.module1.third.ex1.types_of_trees;

import com.volgir.homework.module1.third.ex1.Tree;

public abstract class Conifer extends Tree {
    protected String typesOfNeedles;

    public Conifer(int age, String typesOfNeedles) {
        super(age);
        this.typesOfNeedles = typesOfNeedles;
    }
}

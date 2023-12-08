package com.volgir.homework.third.ex1.types_of_trees;

import com.volgir.homework.third.ex1.Tree;

public abstract class Leafy extends Tree {
    protected boolean isLeaves;

    public Leafy(int age, boolean isLeaves) {
        super(age);
        this.isLeaves = isLeaves;
    }

    public void leavesDown() {
        this.isLeaves = false;
        System.out.println("Листья опадают с дерева");
    }

    public void leavesBloom() {
        this.isLeaves = true;
        System.out.println("Дерево цветет, листья растут.");
    }

}

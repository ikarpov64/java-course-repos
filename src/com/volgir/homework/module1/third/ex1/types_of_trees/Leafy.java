package com.volgir.homework.module1.third.ex1.types_of_trees;

import com.volgir.homework.module1.third.ex1.Tree;

public abstract class Leafy extends Tree {
    protected boolean hasLeaves;

    public Leafy(int age, boolean hasLeaves) {
        super(age);
        this.hasLeaves = hasLeaves;
    }

    public void leavesFall() {
        if (this.hasLeaves) {
            this.hasLeaves = false;
            System.out.println("Листья опадают с дерева");
        } else {
            System.out.println("На дереве нет листьев");
        }
    }

    public void leavesBloom() {
        this.hasLeaves = true;
        System.out.println("Дерево цветет, листья растут.");
    }
}

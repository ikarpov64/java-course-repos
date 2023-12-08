package com.volgir.homework.third.ex1.trees;

import com.volgir.homework.third.ex1.types_of_trees.Leafy;

public class Birch extends Leafy {
    public Birch(int age, boolean isLeaves) {
        super(age, isLeaves);
    }

    public void leavesBloom() {
        super.leavesBloom();
        System.out.println("Источает аллерген");

    }
}

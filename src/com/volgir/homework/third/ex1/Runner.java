package com.volgir.homework.third.ex1;

import com.volgir.homework.third.ex1.trees.Birch;
import com.volgir.homework.third.ex1.trees.Pine;
import com.volgir.homework.third.ex1.trees.Spruce;

public class Runner {
    public static void main(String[] args) {
        Birch myBirch = new Birch(50, false);
        Pine myPine = new Pine(40, true);
        Spruce mySpruce = new Spruce(30, false);

        Tree[] trees = new Tree[] {myBirch, myPine, mySpruce};

        myBirch.leavesBloom();
        System.out.println(Tree.averageAges(trees));
    }
}
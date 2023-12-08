package com.volgir.homework.third.ex1;

public abstract class Tree {
    protected int age;

    public Tree(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static int sumOfAges(Tree[] trees) {
        int sumOfAge = 0;
        for (Tree tree : trees) {
            sumOfAge += tree.getAge();
        }
        return sumOfAge;
    }
}

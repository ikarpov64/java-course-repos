package com.volgir.homework.third.ex1;

public abstract class Tree {
    protected int age;

    public Tree(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static double averageAges(Tree[] trees) {
        double sumOfAge = 0;
        for (Tree tree : trees) {
            sumOfAge += tree.getAge();
        }
        return sumOfAge / trees.length;
    }
}

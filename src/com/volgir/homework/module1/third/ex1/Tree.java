package com.volgir.homework.module1.third.ex1;

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

    public static double averageAge(Tree[] trees) {
        double averageAge = 0;
        for (Tree tree : trees) {
            averageAge += tree.getAge();
        }
        return averageAge / trees.length;
    }
}

package com.volgir.homework.module2.first.ex1;

public class Zoo <T extends Tiger, B extends Bird, D extends Dog> {
    private T tiger;
    private B bird;
    private D dog;

    public Zoo(T tiger, B bird, D dog) {
        this.tiger = tiger;
        this.bird = bird;
        this.dog = dog;
    }

    public T getTiger() {
        return tiger;
    }

    public B getBird() {
        return bird;
    }

    public D getDog() {
        return dog;
    }
}

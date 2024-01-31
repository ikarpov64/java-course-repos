package com.volgir.homework.module2.third.ex4;

/**
 * Задание №4: Гори ясно!
 * Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
 * любого типа.
 * Создать с помощью лямбд выражений:
 * Атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
 * Костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!
 */
public class Runner {
    public static void main(String[] args) {
        Burner<Uranium> atomicReactor = uranium -> System.out.println("Зеленый свет вокруг!");
        Burner<Wood> campfire = wood -> System.out.println("Желто-красный свет вокруг!");

        atomicReactor.burn(new Uranium());
        campfire.burn(new Wood());

    }
}

package com.volgir.homework.module2.third.ex5;

/**
 * Задание №5: универсальная линейка.
 * Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer.
 * Создать с помощью лямбд выражений:
 * Измеритель лодок: на вход лодка(длина), возвращает длину лодки
 * Измеритель животных: на вход животное(длина тела, длина хвоста),
 * возвращает сумму длин тела и хвоста
 */
public class Runner {
    public static void main(String[] args) {
        Ruler<Boat> boatRuler = boat -> boat.getLength();
        System.out.println("Длина лодки: " + boatRuler.measure(new Boat(4500)));

        Ruler<Animal> animalRuler = animal -> animal.getBodyLength() + animal.getTaleLength();
        Animal animal = new Animal(75, 150);
        System.out.println("Длина животного (тело + хвост) равна: " + animalRuler.measure(animal));
    }
}

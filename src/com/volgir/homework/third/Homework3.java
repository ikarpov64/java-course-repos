package com.volgir.homework.third;

import com.volgir.homework.third.ex1.Tree;
import com.volgir.homework.third.ex1.trees.Birch;
import com.volgir.homework.third.ex1.trees.Pine;
import com.volgir.homework.third.ex1.trees.Spruce;
import com.volgir.homework.third.ex2.Factory;
import com.volgir.homework.third.ex2.Iphone;
import com.volgir.homework.third.ex2.Phone;
import com.volgir.homework.third.ex2.Samsung;
import com.volgir.homework.third.ex3.Pyramid1;
import com.volgir.homework.third.ex4.LotteryTicket;
import com.volgir.homework.third.ex5.City;
import com.volgir.homework.third.ex5.House;

public class Homework3 {
    public static void main(String[] args) {
        //В этом дз уже будет проверяться наличие корректных модификаторов доступа
        //у классов, атрибутов, методов
        System.out.println("________________________________________");
        ex1();
        System.out.println("________________________________________");
        ex2();
        System.out.println("________________________________________");
        ex3();
        System.out.println("________________________________________");
        ex4();
        System.out.println("________________________________________");
        ex5();
        System.out.println("________________________________________");
    }

    public static void ex1() {
        //Реализовать в Java следующую схему (в скобках свойства объектов)
        //У нас есть Дерево(возраст)
        //Деревья делятся на:
        //хвойные(имеют тип иголок)
        //лиственные(есть листья на дереве сейчас), умеют опадать (листья пропадают с дерева)
        //умеют цвести (листья появляются)
        //
        //Сосна и Ель являются хвойными.
        //Для сосны характерен тип иголок - крупный.
        //Для ели характерен тип иголок - мелкий.
        //
        //Береза является лиственным деревом.
        //Когда Береза цветет, помимо появления листьев, она источает аллергены (печать в консоль)
        //
        //Создать в методе ex1 сосну, березу, ель. Положить в массив.
        //Посчитать их средний возраст.
        Tree[] trees = new Tree[] {
                new Birch(50, true),
                new Pine(40, "крупные"),
                new Spruce(30, "мелкие")
        };

        System.out.printf("Средний возраст деревьев: %s\n", Tree.averageAge(trees));
    }

    public static void ex2() {
        //Задача: Фабрика телефонов.
        //Создать 2 типа телефонов и комплектующих к ним.
        //При печати телефона должны показываться все свойства телефона и вложенных объектов.
        //1 тип: Samsung galaxy. Имеет операционную систему Android, плату j-108(размер (ширина Х длина Х высота) 10х12х13),
        //камеру Samsung(20x zoom).
        //2 Тип: Iphone 15. Имеет операционную систему Ios, плату 7uik(размер 15х12х13),
        //камеру iphone(15x zoom, есть вспышка).
        //
        //Создать фабрику, которая заполняет созданный телефон деталями
        //При создании телефона в нем нет комплектующих, как будто пустой пластиковый каркас,
        //но при этом модель телефона уже есть.
        //
        //
        //В "фабрике" должно быть два публичных метода с одним названием:
        //один будет собирать iphone, второй будет собирать samsung.
        //В данном методе создать два телефона, собрать их, распечатать.

        Iphone iphone = new Iphone("iPhone 15");
        Samsung samsung = new Samsung("Samsung Galaxy");
        Factory myFactory = new Factory();
        myFactory.buildPhone(iphone);
        myFactory.buildPhone(samsung);
        System.out.println(iphone);
        System.out.println(samsung);
    }

    public static void ex3() {
        //Задача: Пирамида наследования
        //Создать классы Pyramid1, Pyramid2, Pyramid3.
        //НЕОБХОДИМО НАСЛЕДОВАНИЕ С ИСПОЛЬЗОВАНИЕМ РОДИТЕЛЬСКИХ МЕТОДОВ!
        // Создать метод print, который будет выводить следующий текст:
        // M <- из Pyramid1
        // MM <- из Pyramid2
        // MMM <- из Pyramid3

        //Т.е. при вызове pyramid1.print выведется:
        // M
        // MM
        // MMM

        //при вызове pyramid2.print выведется:
        // MM
        // MMM

        //при вызове pyramid3.print выведется:
        // MMM

        //создать здесь pyramid1 и вызвать print
        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();
    }

    public static void ex4() {
        //Задача со звездочкой!: Лотерейный билет.
        //Создать класс лотерейный билет (у объекта не может быть атрибутов).
        //Создать метод проверить удачу (не принимает в себя аргументов!):
        //каждый десятый билет дает 100 руб.
        //каждый сотый - 5_000,
        //иначе 0
        //Если совпало что билет одновременно десятый и сотый выбор в пользу сотого.
        //
        //Создать здесь 100 билетов, и проверить по каждому удачу.
        //Итоговая сумма выигрыша после проверки удачи 100 билетов должна составить 6_000.
        for (int i = 0; i < 110; i++) {
            LotteryTicket ticket = new LotteryTicket();
            ticket.checkLuck();
        }
        System.out.println(LotteryTicket.getWinningAmount());

    }

    public static void ex5() {
        //Задача со звездочкой: иммутабельность города.
        //Иммутабельность - невозможность поменять свойства объекта и всех его вложенных объектов.
        //
        //Создать класс House (наименование улицы, номер дома) - создать сеттеры!, геттеры на него.
        //Переопределить вывод в текст - вывод улицы и номера дома.
        //Создать иммутабельный класс City (наименование города, и массив домов).
        //Переопределить вывод в текст - чтобы выводило имя города, и все дома.
        //
        //Создать два дома, создать город с массивом созданных городов
        //При получении домов из массива, и изменении данных (например замена улицы) у дома,
        //у домов внутри city ничего не поменяется. Т.е. при вызове toString, будут старые имена улицы.

        // Создаем дома.
        House house1 = new House("Ленина", 1);
        House house2 = new House("Революционная", 1);

        // Создаем город, с массивом созданных домов.
        City myCity = new City("Вольск", new House[] {house1, house2});

        // Вызываем печать города.
        System.out.println(myCity);

    }
}

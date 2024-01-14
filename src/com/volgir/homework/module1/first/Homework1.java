package com.volgir.homework.module1.first;

import static com.volgir.homework.module1.first.Product.*;
import static com.volgir.homework.module1.first.TaxRates.*;

public class Homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        // Дана строка:
        String name = "     ПЕтРов Олег Иванович     ";
        // Необходимо:
        // 1. Убрать лишние пробелы.
        // 2. Перевести текст в верхний регистр.
        // 3. Если содержит "ова " - то печатаем на экран: Уважаемая {name};
        // Если содержит "ов " - то печатаем на экран: Уважаемый {name};
        // В иных случаях печатаем на экран: Неизвестное лицо {name}.
        name = name.strip().toUpperCase();
        if (name.contains("ОВ ")) {
            System.out.printf("Уважаемый %s%n", name);
        } else if (name.contains("ОВА")) {
            System.out.printf("Уважаемая %s%n", name);
        } else {
            System.out.printf("Неизвестное лицо %s%n", name);
        }
    }

    public static void ex2() {
        // У нас есть машина. В данной машине есть перечень проверок, перед запуском
        // Количество топлива
        double fuel = 10;
        // Проверка двигателя
        boolean isEngineWork = true;
        // Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        // Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        // Поменять (убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
        // В ином случае, машина не должна запускаться
        if (!(fuel < 10)
                && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                && !hasErrors && isEngineWork) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        // Работа на самостоятельное изучение методов.
        // Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'o' в строке.
        // Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        String newString = simply.toLowerCase().replace("this is", "those are");
        System.out.println(newString.indexOf('o', newString.indexOf('o') + 1));
    }

    public static void ex4() {
        // Компания Рога и Копыта производит мясные продукты.
        // Перечень производимых товаров:
        // Колбаса - стоимость 800 руб.
        // себестоимость при производстве меньше 1000 кг - 412 руб.
        // себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб.
        // себестоимость при производстве от 2000кг - 404 руб.

        // Ветчина - стоимость 350 руб.
        // себестоимость при производстве - 275 руб.

        // Шейка - стоимость 500 руб.
        // себестоимость при производстве меньше 500кг - 311 руб.
        // себестоимость при производстве больше или равно 500кг - 299 руб.

        // Финансовые показатели
        // Доход компании считается как умножение стоимости на количество проданных кг
        // Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        // Прибыль до налогов считается как: доход - расход
        // Налоги считаются так:
        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 от 2_000_000, облагается ставкой 10%
        // прибыль до налогов меньше 1_000_000, облагается ставкой 8%
        // пример расчета налогов для прибыли до налогов 2_500_000:
        // 1_000_000 - налог 80_000 - по ставке 8%
        // 1_000_000 - налог 100_000 - по ставке 10%
        // 500_000 - 65_000 - по ставке 13%
        // Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        // Прибыль после налогов: прибыль до налогов - налог.

        // Необходимо создать универсальную систему расчетов прибыли после налогов,
        // Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании.
        // Узнать прибыль после налогов, при продаже:
        // Колбасы 2000кг
        // Ветчины 8511кг
        // Шейки 6988кг

        // Входные данные по количеству проданных товаров.
        int sausageQty = 2000;
        int sausageCost = getProductCost(SAUSAGE, sausageQty);

        int hamQty = 8511;
        int hamCost = getProductCost(HAM, sausageQty);

        int neckQty = 6988;
        int neckCost = getProductCost(NECK, neckQty);

        // Доход
        int income = SAUSAGE.getPrice() * sausageQty +
                HAM.getPrice() * hamQty +
                NECK.getPrice() * neckQty;

        int overheads = 1_000_000;
        int outcome = sausageCost * sausageQty +
                hamCost * hamQty +
                neckCost * neckQty + overheads;

        long profitBeforeTaxes = income - outcome;

        double profitAfterTaxes = calcTax(profitBeforeTaxes); // Прибыль после налогов.
        System.out.printf("Прибыль после налогов: %s руб.%n", profitAfterTaxes);

    }
    public static int getProductCost(Product product, int countProduct) {
        if (product == SAUSAGE) {
            if (countProduct >= 2000) {
                return 404;
            } else if (countProduct >= 1000) {
                return 408;
            }
            return 412;
        } else if (product == HAM) {
            return 275;
        } else if (product == NECK) {
            return countProduct < 500 ? 311 : 299;
        }
        throw new RuntimeException("Неизвестный продукт");
    }

    public static double calcTax(long profitBeforeTaxes) {
        double totalTax;
        double firstLimit = TAX_RATE_BEFORE_MILLION.getLimit();
        double secondLimit = TAX_RATE_BEFORE_TWO_MILLION.getLimit();
        double taxRateBeforeMillion = TAX_RATE_BEFORE_MILLION.getTaxRate();
        double taxRateBeforeTwoMillion = TAX_RATE_BEFORE_TWO_MILLION.getTaxRate();
        double taxRateAfterTwoMillion = TAX_RATE_AFTER_TWO_MILLION.getTaxRate();

        double totalTaxBeforeMillion = firstLimit * taxRateBeforeMillion;
        double totalTaxBeforeTwoMillion = (secondLimit - firstLimit - 1) * taxRateBeforeTwoMillion;

        if (profitBeforeTaxes > secondLimit) {
            totalTax = (profitBeforeTaxes - secondLimit) * taxRateAfterTwoMillion
                    + totalTaxBeforeTwoMillion + totalTaxBeforeMillion;
        } else if (profitBeforeTaxes > firstLimit) {
            totalTax = (profitBeforeTaxes - firstLimit) * taxRateBeforeTwoMillion + totalTaxBeforeMillion;
        } else if (profitBeforeTaxes > 0) {
            totalTax = profitBeforeTaxes * taxRateBeforeMillion;
        } else {
            totalTax = 0;
        }
        return totalTax;
    }
}

package com.volgir.homework.second.shop;

public class Shop {

    Object[] workers;

    public Shop(Object[] workers) {
        this.workers = workers;
    }

    public void informationAboutWorkers() {
//      String gender = "";
        for (Object worker : this.workers) {
            if ((((Worker)worker).gender) == "М") {
                String gender = "мужчина";
            }
            else if ((((Worker)worker).gender) == "Ж") {
                String gender = "женщина";
            }

            System.out.println(((Worker)worker).name + ": " + ((Worker)worker).age + gender +" лет, {мужчина или женщина}, список вещей: {набор вещей работника}");

        }
    }
}

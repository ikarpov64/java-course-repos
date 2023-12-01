package com.volgir.homework.second.shop;

public class Shop {

    Object[] workers;

    public Shop(Object[] workers) {
        this.workers = workers;
    }

    public void informationAboutWorkers() {
      String gender = "";
        for (Object worker : this.workers) {
            if ((((Worker)worker).gender) == "М") {
                gender = "мужчина";
            }
            else if ((((Worker)worker).gender) == "Ж") {
                gender = "женщина";
            }
            String[] itemList = new String[2];
            for (Object item : ((Worker)worker).items) {
                ((Item)item).name

            }

            System.out.println();
            System.out.println(((Worker)worker).name + ": " + ((Worker)worker).age + " лет," + gender +
                    ", список вещей: " +  "{набор вещей работника}");

        }
    }
}

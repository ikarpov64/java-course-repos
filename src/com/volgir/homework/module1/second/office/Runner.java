package com.volgir.homework.module1.second.office;

public class Runner {
    public static void main(String[] args) {
        Chief chief = new Chief("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Secretary secretary = new Secretary();
        Security security = new Security("Петрович");

        Office office = new Office(chief, manager, secretary, security);

        office.workingDay();
    }
}

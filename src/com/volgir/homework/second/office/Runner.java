package com.volgir.homework.second.office;

public class Runner {
    public static void main(String[] args) {
        Chief chief = new Chief("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Security security = new Security("Петрович");
        Secretary secretary = new Secretary();
        Office office = new Office();

        office.workingDay(chief, manager, secretary, security);

    }
}

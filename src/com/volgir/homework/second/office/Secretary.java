package com.volgir.homework.second.office;

public class Secretary {
    String employeePosition = "Секретарь";

    public void calmDown(String chiefName, String managerName, String securityName) {
        System.out.printf("%s: %s не волнуйтесь, %s все успеет. %s - подождите!%n", employeePosition,
                chiefName, managerName, securityName);
    }
}

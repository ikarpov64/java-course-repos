package com.volgir.homework.four.ex4.ChatException;

public class UserLimitException extends Exception {
    public UserLimitException() {
        System.out.println("Превышено количество пользователей!");
    }
}

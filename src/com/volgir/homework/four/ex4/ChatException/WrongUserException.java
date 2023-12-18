package com.volgir.homework.four.ex4.ChatException;

public class WrongUserException extends Exception {
    public WrongUserException() {
        System.out.println("Пользователя не существует!");
    }
}

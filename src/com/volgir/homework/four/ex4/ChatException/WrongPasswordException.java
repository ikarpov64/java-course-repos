package com.volgir.homework.four.ex4.ChatException;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        System.out.println("Введен неверный пароль!");
    }
}

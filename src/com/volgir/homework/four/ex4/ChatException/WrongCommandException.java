package com.volgir.homework.four.ex4.ChatException;

public class WrongCommandException extends Exception {
    public WrongCommandException() {
        System.out.println("Неверная команда.");
    }
}

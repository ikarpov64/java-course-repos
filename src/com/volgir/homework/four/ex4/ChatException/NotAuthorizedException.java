package com.volgir.homework.four.ex4.ChatException;

public class NotAuthorizedException extends Exception {
    public NotAuthorizedException() {
        System.out.println("Вы не авторизованы для данной операции.");
    }
}

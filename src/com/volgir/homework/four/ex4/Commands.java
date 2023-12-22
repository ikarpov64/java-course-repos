package com.volgir.homework.four.ex4;

public enum Commands {
    NEW_USER("новый"),
    LOGIN("войти"),
    LOGOUT("выйти"),
    WRITE_MESSAGE("написать"),
    READ_MESSAGES("прочитать"),
    EXIT("exit");

    private final String command;

    Commands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}

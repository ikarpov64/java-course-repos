package com.volgir.homework.four.ex4;

import java.sql.Array;

public class User {
    private final String userName;
    private final String password;
    private String[] messages;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.messages = new String[100];
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String[] getMessages() {
        return messages;
    }

    @Override
    public boolean equals(Object obj) {
        return this.userName == ((User) obj).userName;
    }
}

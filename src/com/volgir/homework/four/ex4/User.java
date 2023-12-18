package com.volgir.homework.four.ex4;

public class User {
    private static final int MESSAGE_ARRAY_SIZE = 100;
    private final String userName;
    private final String password;
    private Message[] messages;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.messages = new Message[MESSAGE_ARRAY_SIZE];
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Message[] getMessages() {
        return messages;
    }

    public static User getUser(User[] users, String userName) {
        for (User user : users) {
            if (user != null && user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }
}

package com.volgir.homework.four.ex4;

public class User {
    private static final int MESSAGE_ARRAY_SIZE = 100;
    private int messageCount = 0;
    private final String userName;
    private final String password;
    private Message[] messages = new Message[MESSAGE_ARRAY_SIZE];

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
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

    public void setMessage(Message message) throws ChatException {
        if (this.messageCount < MESSAGE_ARRAY_SIZE) {
            this.messages[messageCount] = message;
            this.messageCount++;
        } else {
            throw new ChatException("Превышен лимит сообщений.");
        }
    }

    public int getMessageCount() {
        return messageCount;
    }
}

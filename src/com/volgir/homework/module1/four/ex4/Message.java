package com.volgir.homework.module1.four.ex4;

public class Message {
    private final String text;
    private final boolean isIncome;
    private final User fromUser;
    private final User toUser;

    public Message(String text, boolean isIncome, User fromUser, User toUser) {
        this.text = text;
        this.isIncome = isIncome;
        this.fromUser = fromUser;
        this.toUser = toUser;
    }

    public String getText() {
        return text;
    }

    public boolean isIncome() {
        return isIncome;
    }

    public User getFromUser() {
        return fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    @Override
    public String toString() {
        if (this.isIncome) {
            return String.format("Письмо от %s: %s", this.fromUser.getUserName(), this.text);
        } else {
            return String.format("Письмо к %s: %s", this.toUser.getUserName(), this.text);
        }
    }
}

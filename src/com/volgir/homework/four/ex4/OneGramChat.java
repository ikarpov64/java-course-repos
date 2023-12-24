package com.volgir.homework.four.ex4;

import java.util.Scanner;

public class OneGramChat {
    private static final int USERS_ARRAY_SIZE = 3;
    private final Scanner scanner = new Scanner(System.in);
    private int registeredUsersCount = 0;
    private final User[] registeredUsers = new User[USERS_ARRAY_SIZE];
    private User currentUser;

    public void startChat() {
        System.out.println("Добро пожаловать в чат!");
        inputWaiting();
    }

    private void inputWaiting() {
        System.out.println("Введите команду. \n"
                + "Список доступных команд: 'войти', 'новый', 'выйти', "
                + "'написать', 'прочитать', 'exit'.");
        String s = scanner.nextLine();
        try {
            messageHandler(s);
        } catch (ChatException e) {
            System.out.println(e.getMessage());
            inputWaiting();
        }
    }

    private void messageHandler(String text) throws ChatException {
        if (text.equalsIgnoreCase(Commands.LOGIN.getCommand())) {
            userLogin();
            inputWaiting();
        } else if (text.equalsIgnoreCase(Commands.LOGOUT.getCommand())) {
            userLogout();
            inputWaiting();
        } else if (text.equalsIgnoreCase(Commands.NEW_USER.getCommand())) {
            createUser();
            inputWaiting();
        } else if (text.equalsIgnoreCase(Commands.WRITE_MESSAGE.getCommand())) {
            sendMessage();
            inputWaiting();
        } else if (text.equalsIgnoreCase(Commands.READ_MESSAGES.getCommand())) {
            readMessage();
            inputWaiting();
        } else if (text.equalsIgnoreCase(Commands.EXIT.getCommand())) {
            scanner.close();
        } else {
            throw new ChatException("Неверная команда.");
        }
    }

    private void createUser() throws ChatException {
        System.out.println("Для регистрации пользователя, введите имя:");
        String name = scanner.nextLine();
        if (name.trim().isEmpty() || (User.getUser(this.registeredUsers, name) != null)) {
            throw new ChatException("Данное имя недоступно.");
        }
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        if (password.trim().isEmpty()) {
            throw new ChatException("Пароль не может быть пустым.");
        }

        if (this.registeredUsersCount < USERS_ARRAY_SIZE) {
            this.registeredUsers[this.registeredUsersCount] = new User(name, password);
            System.out.println("Пользователь создан: " + name);
            this.registeredUsersCount++;
        } else {
            throw new ChatException("Превышено количество пользователей!");
        }
    }

    private void userLogin() throws ChatException {
        System.out.println("Введите имя пользователя для входа:");
        String name = scanner.nextLine();
        if (name.trim().isEmpty()) {
            throw new ChatException("Имя пользователя не может быть пустым.");
        }
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        if (password.trim().isEmpty()) {
            throw new ChatException("Пароль не может быть пустым.");
        }

        User foundUser = User.getUser(this.registeredUsers, name);
        if (foundUser != null) {
            if (foundUser.getPassword().equals(password)) {
                this.currentUser = foundUser;
                System.out.println("Авторизация выполнена успешно. "
                        + "Вы можете отправлять сообщения.");
            } else {
                throw new ChatException("Введен неверный пароль!");
            }
        } else {
            throw new ChatException("Пользователя не существует.");
        }
    }

    private void userLogout() throws ChatException {
        if (this.currentUser != null) {
            this.currentUser = null;
        } else {
            throw new ChatException("Вы не авторизованы.");
        }
    }

    private void sendMessage() throws ChatException {
        System.out.println("Введите имя пользователя для отправки сообщения:");
        User forUser = User.getUser(this.registeredUsers, scanner.nextLine());
        if (forUser == null) {
            throw new ChatException("Адресата не существует.");
        }
        System.out.println("Введите сообщение для отправки:");
        String text = scanner.nextLine();



        if (this.currentUser != null) {
            Message incomeMessage = new Message(text, true, this.currentUser, forUser);
            Message outcomeMessage = new Message(text, false, this.currentUser, forUser);
            forUser.setMessage(incomeMessage);
            this.currentUser.setMessage(outcomeMessage);
        } else {
            throw new ChatException("Авторизуйтесь для отправки сообщений.");
        }
    }

    private void readMessage() throws ChatException {
        if (this.currentUser != null) {
            if (this.currentUser.getMessageCount() != 0) {
                Message[] messages = this.currentUser.getMessages();
                for (int i = 0; i < this.currentUser.getMessageCount(); i++) {
                    System.out.println(messages[i]);
                }
            } else {
                throw new ChatException("Список сообщений пуст.");
            }
        } else {
            throw new ChatException("Для чтения сообщений необходима авторизация.");
        }
    }
}

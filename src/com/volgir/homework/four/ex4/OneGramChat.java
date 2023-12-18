package com.volgir.homework.four.ex4;

import com.volgir.homework.four.ex4.ChatException.UserLimitException;
import com.volgir.homework.four.ex4.ChatException.WrongCommandException;
import com.volgir.homework.four.ex4.ChatException.WrongPasswordException;
import com.volgir.homework.four.ex4.ChatException.WrongUserException;
import java.util.Scanner;

public class OneGramChat {
    private static final int USERS_ARRAY_SIZE = 3;
    private static int registeredUsersCount = 0;
    private static final Scanner scanner = new Scanner(System.in);
    private User[] registeredUsers;
    private User currentUser;

    public OneGramChat() {
        this.registeredUsers = new User[USERS_ARRAY_SIZE];
    }

    public void startChat() {
        System.out.println("Добро пожаловать в чат!");
        inputWaiting();
    }

    private void inputWaiting() {
        System.out.println("Введите команду. \n"
                + "Список доступных команд: 'войти', 'новый', 'выйти', 'написать', 'прочитать', 'exit'.");
        String s = scanner.nextLine();
        try {
            messageHandler(s);
        } catch (WrongCommandException | WrongUserException
                 | WrongPasswordException | UserLimitException e) {
            inputWaiting();
        }
    }

    private void messageHandler(String text) throws
            WrongCommandException, WrongUserException,
            WrongPasswordException, UserLimitException {
        if (text.equalsIgnoreCase("войти")) {
            System.out.println("Введите имя пользователя для входа:");
            String userName = scanner.nextLine();
            System.out.println("Введите пароль:");
            String userPassword = scanner.nextLine();
            userLogin(userName, userPassword);
            inputWaiting();
        } else if (text.equalsIgnoreCase("новый")) {
            System.out.println("Для регистрации пользователя, введите имя:");
            String userName = scanner.nextLine();
            System.out.println("Введите пароль:");
            String userPassword = scanner.nextLine();
            createUser(userName, userPassword);
            inputWaiting();
        } else if (text.equalsIgnoreCase("выйти")) {
            userLogout();
        } else if (text.equalsIgnoreCase("exit")) {
            scanner.close();
        } else if (text.equalsIgnoreCase("написать")) {
            System.out.println("Введите имя пользователя для отправки сообщения:");
            User user = findUser(scanner.nextLine());
            String message = scanner.nextLine();
            sendMessage(user, message);
        } else if (text.equalsIgnoreCase("прочитать")) {
            readMessage();
        } else {
            throw new WrongCommandException();
        }
    }

    public void createUser(String name, String password) throws UserLimitException {
        if (User.getUser(registeredUsers, name) == null) {
            if (registeredUsersCount < USERS_ARRAY_SIZE) {
                registeredUsers[registeredUsersCount] = new User(name, password);
                System.out.println("Пользователь создан " + name);
                registeredUsersCount++;
            } else {
                throw new UserLimitException();
            }
        } else {
            System.out.println("Пользователь уже существует");
        }
    }

    private void userLogin(String name, String password) throws WrongUserException, WrongPasswordException {
        User foundUser = findUser(name);
        if (foundUser != null) {
            if (foundUser.getPassword().equals(password)) {
                this.currentUser = foundUser;
                System.out.println("Авторизация выполнена успешно. "
                        + "Вы можете отправлять сообщения.");
            } else {
                throw new WrongPasswordException();
            }
        } else {
            throw new WrongUserException();
        }
    }

    private void userLogout() {
        if (this.currentUser != null) {
            this.currentUser = null;
        } else {
            System.out.println("Вы не авторизованы.");
        }
    }

    private void sendMessage(User toUser, String text) {

    }

    private void readMessage() {
        for (Message message : this.currentUser.getMessages()) {
            System.out.println(message);
        }
    }

    private User findUser(String targetName) {
        for (User user : this.registeredUsers) {
            if (user != null && user.getUserName().equals(targetName)) {
                return user;
            }
        }
        return null;
    }

    public User getCurrentUser() {
        return currentUser;
    }
}

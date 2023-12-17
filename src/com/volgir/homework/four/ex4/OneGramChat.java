package com.volgir.homework.four.ex4;

import java.util.Arrays;
import java.util.Scanner;

public class OneGramChat {
    private User[] users;
    private User currentUser;

    public OneGramChat() {
        this.users = new User[3];
    }

    public static void main(String[] args) {
        System.out.print("Добро пожаловать в чат. Введите команду для начала.");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(s);
    }

    public void newUser(String userName, String password) {
        User newUser = new User(userName, password);
        if (findUser(newUser)) {
            System.out.println("Пользователь уже существует");
        } else {
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    users[i] = newUser;
                    break;
                }
            }
            System.out.println("Количество пользователей переполнено.");
        }
    }
    
    private boolean findUser(User userForSearch) {
        String userName = userForSearch.getUserName();
        for (User user : this.users) {
            if (user != null) {
                // if  (user.getUserName() == userName) {
                if  (user.equals(userForSearch)) {
                    return true;
                }
            }
        }
        return false;
    }
}

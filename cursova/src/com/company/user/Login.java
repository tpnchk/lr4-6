package com.company.user;

import java.util.Scanner;

public class Login {
    boolean log = false;
    User user;

    public Login(User user) {
        this.user = user;
    }

    public void startLog(){
        //тут потрібно буде реалізувати перевірка логіна і пароля
        printWelcomeSystem();
    }
    private void printWelcomeSystem(){
        System.out.println("Ввітаю " + user.getLogin() + " ви успішно увійшли!");
    }

}


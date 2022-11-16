package com.company.user;

import com.company.tax.Tax;

import java.util.*;

public class User {
    private String login = new String();
    private String password = new String();
    public ArrayList<Tax> taxList = new ArrayList<>();

    public String getLogin() {
        return login;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean compare(String str_login, String str_pass){
        if(str_login.equals(this.login) == true && str_pass.equals(this.password) == true){
            return true;
        }
        return false;
    }
    public void printTaxList(){
        System.out.println("Виведення списку податків");
    }

    private void addTaxMenu(){
        System.out.println("\nОберіть наступний податок який хочете додати:");
        System.out.println("1.Добавити податок з основного або додаткового місця роботи");
        System.out.println("2.Добавити податок з авторських винагород");
        System.out.println("3.Добавити податок з продажу майна");
        System.out.println("4.Добавити податок з отримання грошофих сум або майна");
        System.out.println("5.Добавити податок з отримання коштів з-за кордону");
        System.out.println("6.Добавити податок з пільг на дітей");
        System.out.println("7.Добавити податок з матеріальної допомоги");
        System.out.println("0.Вернутися в попереднє меню");
    }


    public void addTaxsList() {
        System.out.println("Добавлення в список податку");
    }

    public void deleteTaxWithList(){
        System.out.println("Видалення зі списку податку за вказаним індексом");
    }

    public void searchSumTaxs(){
        System.out.println("\nПошук суми всіх податків ");
    }

    public void sortedTaxs(){
        System.out.println("Сортування списку по податку");
    }

    public void searchTaxc(){
        System.out.println("Пошук податку за певними критеріями");
    }


}


package com.company.main;

import com.company.comand.*;
import com.company.user.Login;
import com.company.user.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User("qwer", "qwer");
        Login log = new Login(user);
        log.startLog();

        while (true) {
            printMainMenu();
            Scanner tmp = new Scanner(System.in);
            int choose = tmp.nextInt();
            ComandController controler = new ComandController();

            switch (choose) {
                case 1:

                    PrintTaxList printTaxList = new PrintTaxList(user);
                    controler = new ComandController(printTaxList);
                    break;
                case 2:
                    AddTaxsList addTaxsList = new AddTaxsList(user);
                    controler = new ComandController(addTaxsList);
                    break;
                case 3:
                    DeleteTaxWithList deleteTaxWithList = new DeleteTaxWithList(user);
                    controler = new ComandController(deleteTaxWithList);
                    break;
                case 4:
                    SearchSumTaxs searchSumTaxs = new SearchSumTaxs(user);
                    controler = new ComandController(searchSumTaxs);
                    break;
                case 5:
                    SortedTaxs sortedTaxs = new SortedTaxs(user);
                    controler = new ComandController(sortedTaxs);
                    break;
                case 6:
                    SearchTax searchTax = new SearchTax(user);
                    controler = new ComandController(searchTax);
                    break;
                case 0:
                    return;
            }
            controler.useCommand();
        }

    }

    static private void printMainMenu(){
        System.out.println("\n\nОтож оберіть наступну дію:");
        System.out.println("1.Переглянути список податків");
        System.out.println("2.Добавити новий податок в список");
        System.out.println("3.Видалити зі списка податок");
        System.out.println("4.Визначити суму податків");
        System.out.println("5.Відсортувати податки");
        System.out.println("6.Вивести податки лише з певною категорією");
        System.out.println("0.Вихід з програми");
    }
}

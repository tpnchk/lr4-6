package com.company.comand;

import com.company.user.User;

public class PrintTaxList implements Comand {
    User user;

    public PrintTaxList(User user){
        this.user = user;
    }

    @Override
    public void execute() {
        user.printTaxList();
    }
}



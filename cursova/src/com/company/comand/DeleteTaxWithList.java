package com.company.comand;

import com.company.user.User;

public class DeleteTaxWithList implements Comand{
    User user;

    public DeleteTaxWithList(User user){
        this.user = user;
    }

    @Override
    public void execute() {
        user.deleteTaxWithList();
    }
}



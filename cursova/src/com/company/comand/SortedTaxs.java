package com.company.comand;

import com.company.user.User;

public class SortedTaxs implements Comand{
    User user;

    public SortedTaxs(User user){
        this.user = user;
    }

    @Override
    public void execute() {
        user.sortedTaxs();
    }
}


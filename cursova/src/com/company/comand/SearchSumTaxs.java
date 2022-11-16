package com.company.comand;

import com.company.user.User;

public class SearchSumTaxs implements Comand{
    User user;

    public SearchSumTaxs(User user){
        this.user = user;
    }

    @Override
    public void execute() {
        user.searchSumTaxs();
    }
}

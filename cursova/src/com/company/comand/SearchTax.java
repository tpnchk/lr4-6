package com.company.comand;
import com.company.user.User;

public class SearchTax implements Comand{
    User user;

    public SearchTax(User user){
        this.user = user;
    }

    @Override
    public void execute() {
        user.searchTaxc();
    }
}



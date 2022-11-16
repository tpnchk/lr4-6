
package com.company.comand;

import com.company.user.User;

public class AddTaxsList implements Comand{
    User user;

    public AddTaxsList(User user){
        this.user = user;
    }

    @Override
    public void execute() {
        user.addTaxsList();
    }
}



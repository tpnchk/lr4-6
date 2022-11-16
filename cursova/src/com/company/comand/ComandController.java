package com.company.comand;

public class ComandController {
    public Comand comand;

    public ComandController(Comand comand){
        this.comand = comand;
    }

    public ComandController() {

    }

    public void useCommand(){
        this.comand.execute();
    }
}


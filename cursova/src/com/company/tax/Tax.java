package com.company.tax;

public class Tax {
    private String name = new String();
    private double money;
    private int participant;
    private double tax;

    public Tax() {
    }

    public Tax(double money, int participant, String nameTax) {
        this.money = money;
        this.participant = participant;
        this.name = nameTax;
        tax = money / 100 * participant;
    }

    public double gettax() {
        return tax;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "Імя вашого податку='" + name + '\'' +
                        ", початковий баланс =" + money +
                        ", процент податку =" + participant +
                        ", сума податку =" + tax;
    }
}


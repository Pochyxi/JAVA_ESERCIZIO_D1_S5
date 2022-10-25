package com.example.java_esercizio_d1_s5.beans;

public class ExtraAnanasDecorator extends ExtraTopping {
    public ExtraAnanasDecorator(Consumation consumation) {
        this.consumation = consumation;
    }
    @Override
    public double getPrice() {
        return this.consumation.getPrice() + 1;
    }

    @Override
    public String getProductName() {
        return this.consumation.getProductName() + " + ananas";
    }
}

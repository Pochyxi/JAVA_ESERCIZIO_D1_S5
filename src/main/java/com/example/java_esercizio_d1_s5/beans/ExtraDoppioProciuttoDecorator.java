package com.example.java_esercizio_d1_s5.beans;

public class ExtraDoppioProciuttoDecorator extends ExtraTopping {

    public ExtraDoppioProciuttoDecorator(Consumation consumation) {
        this.consumation = consumation;
    }

    @Override
    public String getProductName() {
        return consumation.getProductName() + " + doppio prosciutto";
    }

    @Override
    public double getPrice() {
        return consumation.getPrice() + 0.50;
    }
}

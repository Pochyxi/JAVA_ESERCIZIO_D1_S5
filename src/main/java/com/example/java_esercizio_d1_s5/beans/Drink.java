package com.example.java_esercizio_d1_s5.beans;

public class Drink extends Consumation{
    public Drink() {
        productName = "Drink";
    }

    @Override
    public double getPrice() {
        return 1.00;
    }
}

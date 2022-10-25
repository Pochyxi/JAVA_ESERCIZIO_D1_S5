package com.example.java_esercizio_d1_s5.beans;

public class Pizza extends Consumation {
    public Pizza() {
        this.productName = "Pizza";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }
}

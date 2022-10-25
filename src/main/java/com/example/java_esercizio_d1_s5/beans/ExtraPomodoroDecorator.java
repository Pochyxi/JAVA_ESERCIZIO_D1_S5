package com.example.java_esercizio_d1_s5.beans;

public class ExtraPomodoroDecorator extends ExtraTopping{

    public ExtraPomodoroDecorator(Consumation consumation) {
        this.consumation = consumation;
    }
    @Override
    public double getPrice() {
        return this.consumation.getPrice() + 0.50;
    }

    @Override
    public String getProductName() {
        return this.consumation.getProductName() + " + pomodoro";
    }
}

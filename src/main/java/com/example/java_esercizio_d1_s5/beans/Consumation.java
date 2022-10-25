package com.example.java_esercizio_d1_s5.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Consumation {

    String productName;
    public abstract double getPrice();
}

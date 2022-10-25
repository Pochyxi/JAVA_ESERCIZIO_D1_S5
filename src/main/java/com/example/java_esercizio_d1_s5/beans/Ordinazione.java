package com.example.java_esercizio_d1_s5.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Ordinazione {
    private List<Consumation> ordinazioni;

    public double calcolaTotaleOrdine() {
        double totale = 0;

        for( int i = 0; i < ordinazioni.size(); i++ ) {
            totale += ordinazioni.get(i).getPrice();
        }
        System.out.println("Il totale è: " + totale + " €");
        return totale;
    }
}

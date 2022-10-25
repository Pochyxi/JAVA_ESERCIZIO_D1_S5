package com.example.java_esercizio_d1_s5;

import com.example.java_esercizio_d1_s5.beans.*;
import com.example.java_esercizio_d1_s5.configs.Conf1;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JavaEsercizioD1S5Application {

    public static void main( String[] args ) {

        Ordinazione ordinazione1 = new Ordinazione(conf1());

    }

    public static List<Consumation> conf1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Conf1.class);

        Consumation p1 = ctx.getBean("Margherita", Consumation.class);
        System.out.println(p1.getProductName() + " - prezzo " + p1.getPrice() + " €");

        Consumation p2 = ctx.getBean("MargheritaConCotto", Consumation.class);
        System.out.println(p2.getProductName() + " - prezzo " + p2.getPrice() + " €");

        Consumation p3 = ctx.getBean("PizzaDelDiavolo", Consumation.class);
        System.out.println(p3.getProductName() + " - prezzo " + p3.getPrice() + " €");

        List<Consumation> consumations = new ArrayList<>();
        consumations.add(p1);
        consumations.add(p2);
        consumations.add(p3);


        ((AnnotationConfigApplicationContext)ctx).close();

        return consumations;
    }

}

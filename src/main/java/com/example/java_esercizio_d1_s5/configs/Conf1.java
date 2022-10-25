package com.example.java_esercizio_d1_s5.configs;

import com.example.java_esercizio_d1_s5.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Conf1 {

    @Bean
    @Scope("prototype")
    public Consumation Margherita() {
        return new ExtraPomodoroDecorator( new ExtraMozzarellaDecorator(new Pizza()));
    }

    @Bean
    @Scope("prototype")
    public Consumation MargheritaConCotto() {
        return new ExtraPomodoroDecorator( new ExtraMozzarellaDecorator(new ExtraDoppioProciuttoDecorator(new Pizza())));
    }

    @Bean
    @Scope("prototype")
    public Consumation PizzaDelDiavolo() {
        return new ExtraPomodoroDecorator( new ExtraMozzarellaDecorator(new ExtraDoppioProciuttoDecorator(new ExtraAnanasDecorator(new Pizza()))));
    }
}

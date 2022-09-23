package com.telran.pizzaService;

public class PizzaFactory {

    public static Pizza order(Pizzas name){
        switch (name) {
            case MOZARELLA:
                return new Mozarella(name.name());
            case GAWAII:
                return new Gawaii(name.name());
            case SALAMI:
                return new Salami(name.name());
        }

        return null;
    }
}

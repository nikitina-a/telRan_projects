package com.telran.pizzaService;

import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);
        System.out.println("What kind of pizza would you like to order? \n Enter: \n MOZARELLLA \n GAWAII \n SALAMI " );
        String answer = order.next();
        Pizzas pizzaType = Pizzas.valueOf(answer);
        Pizza newOrder = PizzaFactory.order(pizzaType);
        newOrder.orderPizza();


    }
}

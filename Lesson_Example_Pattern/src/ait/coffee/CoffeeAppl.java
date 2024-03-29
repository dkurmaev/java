package ait.coffee;

import ait.coffee.model.Coffee;

public class CoffeeAppl {
    public static void main(String[] args) {

        Coffee coffee1 = new Coffee("Latte", 5, 2);

        Coffee coffee2 = new Coffee();
        coffee2.setSugar(5);
        coffee2.setMilk(0);

        Coffee blackCoffee = new Coffee.Builder()
                .sugar("1")
                .milk(0)
                .type("Black")
                .build();

        System.out.println(coffee1);
        System.out.println(coffee2);
        System.out.println(blackCoffee);
    }
}


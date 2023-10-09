package Coffees.Supplements;

import Coffees.Coffee;

abstract class CoffeeDecorator extends Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract String getCoffeeType();
}

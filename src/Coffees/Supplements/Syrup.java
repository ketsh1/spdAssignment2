package Coffees.Supplements;

import Coffees.Coffee;

public class Syrup extends CoffeeDecorator {
    public Syrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeType() {
        return coffee.getCoffeeType() + ", with syrup";
    }

    @Override
    public double cost() {
        return coffee.cost() + 100;
    }
}

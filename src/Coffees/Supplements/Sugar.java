package Coffees.Supplements;

import Coffees.Coffee;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 50;
    }

    @Override
    public String getCoffeeType() {
        return coffee.getCoffeeType() + ", with Sugar";
    }
}

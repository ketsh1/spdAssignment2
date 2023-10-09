package Coffees.Supplements;

import Coffees.Coffee;

public class Marshmallow extends CoffeeDecorator {

    public Marshmallow(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 200;
    }

    @Override
    public String getCoffeeType() {
        return coffee.getCoffeeType() + ", with Marshmallow";
    }
}

package Coffees;

public abstract class Coffee {
    protected String coffeeType;

    public String getCoffeeType() {
        return coffeeType;
    }

    public abstract double cost();
}

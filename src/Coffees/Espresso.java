package Coffees;

public class Espresso extends Coffee {
    public Espresso() {
        coffeeType = "Espresso";
    }

    @Override
    public double cost() {
        return 700;
    }
}

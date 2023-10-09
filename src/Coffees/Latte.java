package Coffees;

public class Latte extends Coffee {
    public Latte() {
        coffeeType = "Latte";
    }

    @Override
    public double cost() {
        return 800;
    }
}

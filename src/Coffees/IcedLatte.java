package Coffees;

public class IcedLatte extends Coffee {
    public IcedLatte() {
        coffeeType = "IcedLatte";
    }


    @Override
    public double cost() {
        return 800;
    }
}

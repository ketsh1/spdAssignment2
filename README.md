# Decorator design pattern

A decorator is a structural pattern that allows you to add new behaviors to objects on the fly by wrapping them in wrapper objects.


## Base Coffee Class

```java
public abstract class Coffee {
    protected String coffeeType;

    public String getCoffeeType() {
        return coffeeType;
    }

    public abstract double cost();
}
```

## Base Coffee Decarator

```java
abstract class CoffeeDecorator extends Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract String getCoffeeType();
}
```


## Features

- Choose from three types of coffee: Espresso, Latte, and Ice Latte.
- Customize your coffee with condiments: Sugar, Syrup, and Marshmallow.
- Display the description and cost of the customized coffee order.
- Exit the application when you're done ordering.

## How to Use

1. Run the Java application in your terminal.
2. Select a coffee type from the available options (1, 2, 3).
3. Customize your coffee by adding condiments (1, 2, 3).
4. Review your order with the description and cost.
5. To exit, select option 4.

## Coffee Types

1. Espresso
2. Latte
3. Iced Latte

## Condiments

1. Add Sugar
2. Add Marshmallow
3. Add Syrup


## How to Run

1. Clone this repository to your local machine:

   ```shell
   git clone https://github.com/your-username/coffee-shop-terminal.git
   ```


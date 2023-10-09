import Coffees.Coffee;
import Coffees.Espresso;
import Coffees.IcedLatte;
import Coffees.Latte;
import Coffees.Supplements.Marshmallow;
import Coffees.Supplements.Sugar;
import Coffees.Supplements.Syrup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Welcome to the Coffee Shop!");
            System.out.println("Select your coffee:");

            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Iced Latte");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }

            Coffee coffee = null;
            switch (choice) {
                case 1:
                    coffee = new Espresso();
                    break;
                case 2:
                    coffee = new Latte();
                    break;
                case 3:
                    coffee = new IcedLatte();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            while (true) {
                System.out.println("Customize your coffee:");

                System.out.println("1. Add Sugar");
                System.out.println("2. Add Syrup");
                System.out.println("3. Add Marshmallow");
                System.out.println("4. Done");

                int customChoice = scanner.nextInt();

                if (customChoice == 4) {
                    break;
                }

                switch (customChoice) {
                    case 1:
                        coffee = new Sugar(coffee);
                        break;
                    case 2:
                        coffee = new Syrup(coffee);
                        break;
                    case 3:
                        coffee = new Marshmallow(coffee);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

            System.out.println("Your order: " + coffee.getCoffeeType());
            System.out.println("Cost: ₸" + coffee.cost());
        }

    }
}
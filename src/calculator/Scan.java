package calculator;

import java.util.Scanner;

public class Scan {
    int choice;
    double amount;
    double dollar, yuan, euro;

    void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Options:");
        System.out.println("Enter 1: Dollar");
        System.out.println("Enter 2: Yuan");
        System.out.println("Enter 3: Euro");
        // добавить опцию 4й валюты

        System.out.println("\nChoose your option: ");
        choice = sc.nextInt();
        System.out.println("Your number is: " + choice);

        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextFloat();
        System.out.println("Your amount is: " + amount);

        switch (choice)
        {
            case 1: // Dollar Conversion
                yuan = amount * 7.12;
                System.out.println(amount + " Dollar = " + yuan + " Yuan");
                euro = amount * 1.02;
                System.out.println(amount + " Dollar = " + euro + " Euro");
                break;

            case 2: // Yuan Conversion
                dollar = amount * 0.14;
                System.out.println(amount + " Yuan = " + dollar + " Dollar");
                euro = amount * 0.14;
                System.out.println(amount + " Yuan = " + euro + " Euro");
                break;

            case 3: // Euro Conversion
                dollar = amount * 0.98;
                System.out.println(amount + " Euro = " + dollar + " Dollar");
                yuan = amount * 6.98;
                System.out.println(amount + " Euro = " + yuan + " Yuan");
                break;

            // добавить обработку ввода "case 4"

            // Default case
            default:
                System.out.println("Invalid input");
        }
    }
}

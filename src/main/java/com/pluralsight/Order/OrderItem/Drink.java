package com.pluralsight.Order.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drink {

    private String drinkSize;
    private String drinkFlavor;
    private double drinkPrice;

    //Constructors

    public Drink(String drinkSize, String drinkFlavor, double drinkPrice) {
        this.drinkSize = drinkSize;
        this.drinkFlavor = drinkFlavor;
        this.drinkPrice = drinkPrice;
    }

    //Getters and Setters
    //Drink Size
    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    //Drink Flavor
    public String getDrinkFlavor() {
        return drinkFlavor;
    }

    public void setDrinkFlavor(String drinkFlavor) {
        this.drinkFlavor = drinkFlavor;
    }

    //Drink Price
    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public static void DrinkFlavor() {

        Scanner scanner = new Scanner(System.in);
        List<String> selectedDrinkFlavor = new ArrayList<>();

        boolean choosing = true;

        while (choosing) {
            System.out.println("Drink Flavor Options:\n" +
                    "1)  Fanta Orange\n" +
                    "2)  Ginger Ale\n" +
                    "3)  Snapple Apple\n" +
                    "4)  Sprite\n" +
                    "5)  Dr Pepper\n" +
                    "6)  Coca Cola\n" +
                    "7)  Pepsi\n" +
                    "8)  Lemonade\n" +
                    "9)  Fruit Punch\n" +
                    "10) Water\n" +
                    "Select a Drink Flavor (1-10):");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    selectedDrinkFlavor.add("Fanta Orange");
                    break;
                case 2:
                    selectedDrinkFlavor.add("Ginger Ale");
                    break;
                case 3:
                    selectedDrinkFlavor.add("Snapple Apple");
                    break;
                case 4:
                    selectedDrinkFlavor.add("Sprite");
                    break;
                case 5:
                    selectedDrinkFlavor.add("Dr Pepper");
                    break;
                case 6:
                    selectedDrinkFlavor.add("Coca Cola");
                    break;
                case 7:
                    selectedDrinkFlavor.add("Pepsi");
                    break;
                case 8:
                    selectedDrinkFlavor.add("Lemonade");
                    break;
                case 9:
                    selectedDrinkFlavor.add("Fruit Punch");
                    break;
                case 10:
                    selectedDrinkFlavor.add("Water");
                    break;
                case 11:
                    choosing = false;
                    break;
                default:
                    System.out.println("Invalid Choice Try Again.");
            }
            System.out.println();
        }

    }

}

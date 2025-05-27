package com.pluralsight.Order.OrderItem.Sandwich;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Toppings {

    private String meat;
    private String extraMeat;
    private String cheese;
    private String extraCheese;
    private String regularTopping;
    private String sauce;
    private String side; //need to move to its own class
    private double toppingPrice;

    public static void Meat(){

        Scanner scanner = new Scanner(System.in);
        List<String>selectedMeatToppings = new ArrayList<>();

        boolean choosing = true;

        while (choosing){
            System.out.println("Meat Topping Options:\n" +
                    "1) Steak\n" +
                    "2) Ham\n" +
                    "3) Salami\n" +
                    "4) Roast Beef\n" +
                    "5) Chicken\n" +
                    "6) Bacon\n" +
                    "Select a Meat Topping (1-6):");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: selectedMeatToppings.add("Steak");
                break;
                case 2: selectedMeatToppings.add("Ham");
                break;
                case 3: selectedMeatToppings.add("Salami");
                break;
                case 4: selectedMeatToppings.add("Roast Beef");
                break;
                case 5: selectedMeatToppings.add("Chicken");
                break;
                case 6: selectedMeatToppings.add("Bacon");
                break;
                case 7: choosing = false;
                break;
                default:
                    System.out.println("Invalid Choice Try Again.");
            }
            System.out.println();
        }


    }
    public static void Cheese(){

        Scanner scanner = new Scanner(System.in);
        List<String>selectedCheeseToppings = new ArrayList<>();

        boolean choosing = true;

        while (choosing){
            System.out.println("Cheese Topping Options:\n" +
                    "1) American\n" +
                    "2) Provolone\n" +
                    "3) Cheddar\n" +
                    "4) Swiss\n" +
                    "Select a Cheese Topping (1-4):");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: selectedCheeseToppings.add("American");
                    break;
                case 2: selectedCheeseToppings.add("Provolone");
                    break;
                case 3: selectedCheeseToppings.add("Cheddar");
                    break;
                case 4: selectedCheeseToppings.add("Swiss");
                    break;
                case 5: choosing = false;
                    break;
                default:
                    System.out.println("Invalid Choice Try Again.");
            }
            System.out.println();
        }


    }
    public static void Regular(){

        Scanner scanner = new Scanner(System.in);
        List<String>selectedRegularToppings = new ArrayList<>();

        boolean choosing = true;

        while (choosing){
            System.out.println("Regular Topping Options:\n" +
                    "1) Lettuce\n" +
                    "2) Peppers\n" +
                    "3) Onions\n" +
                    "4) Tomatoes\n" +
                    "5) Jalapenos\n" +
                    "6) Cucumbers\n" +
                    "7) Pickles\n" +
                    "8) Guacamole\n" +
                    "9) Mushrooms\n" +
                    "Select a Regular Topping (1-9):");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: selectedRegularToppings.add("Lettuce");
                    break;
                case 2: selectedRegularToppings.add("Peppers");
                    break;
                case 3: selectedRegularToppings.add("Onions");
                    break;
                case 4: selectedRegularToppings.add("Tomatoes");
                    break;
                case 5: selectedRegularToppings.add("Jalapenos");
                    break;
                case 6: selectedRegularToppings.add("Cucumbers");
                    break;
                case 7: selectedRegularToppings.add("Pickles");
                    break;
                case 8: selectedRegularToppings.add("Guacamole");
                    break;
                case 9: selectedRegularToppings.add("Mushrooms");
                    break;
                case 10: choosing = false;
                    break;
                default:
                    System.out.println("Invalid Choice Try Again.");
            }
            System.out.println();
        }


    }
    public static void Sauce(){

        Scanner scanner = new Scanner(System.in);
        List<String>selectedSauceToppings = new ArrayList<>();

        boolean choosing = true;

        while (choosing){
            System.out.println("Sauce Topping Options:\n" +
                    "1) Mayo\n" +
                    "2) Mustard\n" +
                    "3) Ketchup\n" +
                    "4) Ranch\n" +
                    "5) Thousand Islands\n" +
                    "6) Vinaigrette\n" +
                    "Select a Sauce Topping (1-6):");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: selectedSauceToppings.add("Mayo");
                    break;
                case 2: selectedSauceToppings.add("Mustard");
                    break;
                case 3: selectedSauceToppings.add("Ketchup");
                    break;
                case 4: selectedSauceToppings.add("Ranch");
                    break;
                case 5: selectedSauceToppings.add("Thousand Islands");
                    break;
                case 6: selectedSauceToppings.add("Vinaigrette");
                break;
                case 7: choosing = false;
                    break;
                default:
                    System.out.println("Invalid Choice Try Again.");
            }
            System.out.println();
        }


    }
}

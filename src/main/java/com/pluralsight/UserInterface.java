package com.pluralsight;

import com.pluralsight.Order.Order;
import com.pluralsight.Order.OrderItem.Chips;
import com.pluralsight.Order.OrderItem.Drink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner = new Scanner(System.in);


    public void display() {
        HomeScreen();
    }


    private void HomeScreen() {

        Scanner scanner = new Scanner(System.in);

        String HomeScreen = "Welcome to BRUHways were we do it the BRUH ways\n" +
                "Please Enter an option BRUH:\n" +
                "(1)New Order\n" +
                "(0)Exit the BRUHway";

        String option;

        do {

            System.out.println(HomeScreen);
            option = scanner.nextLine();

            if (option.equalsIgnoreCase("1")) {

                OrderScreen();

            } else if (option.equalsIgnoreCase("0")) {

                Exit();

            } else {
                System.out.println("No Menu option matches this input please try again");
                HomeScreen();
            }

        } while (!option.equalsIgnoreCase("0"));

    }

    private void OrderScreen() {

        Order createdOrder = new Order();

        Scanner scanner = new Scanner(System.in);

        //Collect Order Name

        String OrderScreen = "Let's order the BRUH way, BRUH \n" +
                "Enter your option BRUH:\n" +
                "(1)Add Sandwich\n" +
                "(2)Add Drink\n" +
                "(3)Add Chips\n" +
                "(4)Check Out\n" +
                "(0)Cancel Order";

        String option;

        do {

            System.out.println(OrderScreen);
            option = scanner.nextLine();

            if (option.equalsIgnoreCase("1")) {

                AddSandwich();

            } else if (option.equalsIgnoreCase("2")) {

                Drink drink = AddDrink();

                createdOrder.addOrderItem(drink);

                OrderScreen();

            } else if (option.equalsIgnoreCase("3")) {

                Chips chips = AddChips();

                createdOrder.addOrderItem(chips);

                OrderScreen();

            } else if (option.equalsIgnoreCase("4")) {

                CheckOut();

            } else if (option.equalsIgnoreCase("0")) {

                CancelOrder();

            } else {
                System.out.println("No Menu option matches this input please try again, BRUH.");
                HomeScreen();
            }

        } while (!option.equalsIgnoreCase("0"));

    }

    private void AddSandwich() {

        //Sandwich Size
        //Bread Type
        //Toppings
        //Toasted

    }

    private Drink AddDrink() {

        //Drink Size
        Scanner scanner = new Scanner(System.in);

        String selectedDrinkSize = "";
        String selectedDrinkFlavor = "";

        System.out.println("Enter Your Drink Size BRUH:\n" +
                "S,M,L\n" +
                "[S] Small ($2.00)\n" +
                "[M] Medium ($2.50)\n" +
                "[L] Large ($3.00)\n");
        String option;

        do {

            System.out.println();
            option = scanner.nextLine();

            if (option.equalsIgnoreCase("S")) {

                selectedDrinkSize = "Small";

            } else if (option.equalsIgnoreCase("M")) {

                selectedDrinkSize = "Medium";

            } else if (option.equalsIgnoreCase("L")) {

                selectedDrinkSize = "Large";

            } else {

                System.out.println("Invaild Drink Size try again");

            }
        } while (!option.equalsIgnoreCase("C"));

        //Drink Flavor
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
                    selectedDrinkFlavor = "Fanta Orange";
                    break;
                case 2:
                    selectedDrinkFlavor = "Ginger Ale";
                    break;
                case 3:
                    selectedDrinkFlavor = "Snapple Apple";
                    break;
                case 4:
                    selectedDrinkFlavor = "Sprite";
                    break;
                case 5:
                    selectedDrinkFlavor = "Dr Pepper";
                    break;
                case 6:
                    selectedDrinkFlavor = "Coca Cola";
                    break;
                case 7:
                    selectedDrinkFlavor = "Pepsi";
                    break;
                case 8:
                    selectedDrinkFlavor = "Lemonade";
                    break;
                case 9:
                    selectedDrinkFlavor = "Fruit Punch";
                    break;
                case 10:
                    selectedDrinkFlavor = "Water";
                    break;
                case 11:
                    choosing = false;
                    break;
                default:
                    System.out.println("Invalid Choice Try Again.");
            }
        }

        Drink drink = new Drink(selectedDrinkFlavor, selectedDrinkSize);

        System.out.println("Ight bet, adding drink!");//print out drink order

        return drink;
    }

    private Chips AddChips() {
        //ask the user the flavor
        Scanner scanner = new Scanner(System.in);
        String selectedChipsFlavor = "";//changed from array list to string 😐😐😐

        boolean choosing = true;

        while (choosing) {
            System.out.println("Chips Flavor Options:\n" +
                    "1) Plain\n" +
                    "2) Salt N Vinegar\n" +
                    "3) Barbecue\n" +
                    "4) Sour Cream and Onion\n" +
                    "5) Flamin' Hot Cheetos\n" +
                    "6) White Cheddar Popcorn\n" +
                    "Select a Chips Flavor (1-6):");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    selectedChipsFlavor = "Plain";
                    break;
                case 2:
                    selectedChipsFlavor = "Salt N Vinegar";
                    break;
                case 3:
                    selectedChipsFlavor = "Barbecue";
                    break;
                case 4:
                    selectedChipsFlavor = "Sour Cream and Onion";
                    break;
                case 5:
                    selectedChipsFlavor = "Flamin' Hot Cheetos";
                    break;
                case 6:
                    selectedChipsFlavor = "White Cheddar Popcorn";
                    break;
                case 7:
                    choosing = false;
                    break;
                default:
                    System.out.println("Invalid Choice Try Again.");
            }
            System.out.println();
        }
        //create the chips object
        Chips chips = new Chips(selectedChipsFlavor);

        System.out.println("Ight bet, adding chips!");
        return chips;
    }

    private void CheckOut() {

    }

    private void CancelOrder() {

        System.out.println("Are you sure you would like to Cancel your order BRUH?🤓");

        System.out.println("Your Order Has Been Canceled");

    }

    private void Exit() {

        System.out.println("Bye BRUH ✌️");

    }
}



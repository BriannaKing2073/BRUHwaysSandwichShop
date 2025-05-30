package com.pluralsight;

import com.pluralsight.Order.Order;
import com.pluralsight.Order.OrderItem.Chips;
import com.pluralsight.Order.OrderItem.Drink;
import com.pluralsight.Order.OrderItem.Sandwich.Sandwich;
import com.pluralsight.Order.OrderItem.SideSauce;

import java.util.ArrayList;
import java.util.Collections;
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
                "(1)New Order 🍽️\n" +
                "(0)Exit the BRUHway 🍽️➡️🏃🏾‍➡️";

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

//        //Collect Order Name
//        System.out.println("What's your name,BRUH?");
//
//        String orderName = scanner.nextLine();
//
//        createdOrder.addOrderItem(orderName);

        String OrderScreen = "Let's order the BRUH way, BRUH \n" +
                "Enter your option BRUH:\n" +
                "(1)Add Sandwich 🥪\n" +
                "(2)Add Drink 🥤\n" +
                "(3)Add Chips 🍿\n" +
                "(4)Add Side Sauce 🥣\n" +
                "(5)Check Out 🛎️\n" +
                "(0)Cancel Order ❌";

        String option;

        do {

            System.out.println(OrderScreen);
            option = scanner.nextLine();

            if (option.equalsIgnoreCase("1")) {

                Sandwich sandwich = AddSandwich();

                createdOrder.addOrderItem(sandwich);

            } else if (option.equalsIgnoreCase("2")) {

                Drink drink = AddDrink();

                createdOrder.addOrderItem(drink);

               OrderScreen();

            } else if (option.equalsIgnoreCase("3")) {

                Chips chips = AddChips();

                createdOrder.addOrderItem(chips);

                //OrderScreen();

            } else if (option.equalsIgnoreCase("4")) {

                SideSauce sideSauce = AddSideSauce();
                createdOrder.addOrderItem(sideSauce);

            } else if (option.equalsIgnoreCase("5")) {

                CheckOut();

            } else if (option.equalsIgnoreCase("0")) {

                CancelOrder();

            } else {
                System.out.println("No Menu option matches this input please try again, BRUH.");
                HomeScreen();
            }

        } while (!option.equalsIgnoreCase("0"));

    }

    private Sandwich AddSandwich() {

        Scanner scanner = new Scanner(System.in);

        String selectedSandwichSize = "";
        String selectedBreadType = "";
        String selectedToppings = ""; //List selectedToppings = Collections.singletonList("");
        boolean selectedToasted = false;

        //Sandwich Size
        System.out.println("Enter Your Sandwich Size BRUH:\n" +
                "4,8,12\n" +
                "[4] 4 inches ($5.50)\n" +
                "[8] 8 inches ($7.00)\n" +
                "[12] 12 inches ($8.50)\n");

        String option;

        do {

            option = scanner.nextLine();

            if (option.equalsIgnoreCase("4")) {

                selectedSandwichSize = "4 inches";

            } else if (option.equalsIgnoreCase("8")) {

                selectedSandwichSize = "8 inches";

            } else if (option.equalsIgnoreCase("12")) {

                selectedSandwichSize = "12 inches";

            } else {

                System.out.println("Invalid Sandwich Size try again");

            }
        } while (selectedSandwichSize.equalsIgnoreCase(""));

        //Bread Type
        boolean choosingBread = true;

        while (choosingBread) {
            System.out.println("Bread Type Options:\n" +
                    "1) White \n" +
                    "2) Wheat\n" +
                    "3) Rye \n" +
                    "4) Wrap \n" +

                    "Select a Bread Type (1-4):\n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    selectedBreadType = "White";
                    break;
                case 2:
                    selectedBreadType = "Wheat";
                    break;
                case 3:
                    selectedBreadType = "Rye";
                    break;
                case 4:
                    selectedBreadType = "Wrap";
                    break;
                case 5:
                    choosingBread = false;
                    break;
                default:
                    System.out.println("Invalid Choice Try Again.");
            }

        }

        //Toppings

        selectedToppings = "[insert toppings here]";

        //Meat

            List<String>selectedMeatToppings = new ArrayList<>();

            boolean choosingMeat = true;

            while (choosingMeat){
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
                    case 7: choosingMeat = false;
                        break;
                    default:
                        System.out.println("Invalid Choice Try Again.");
                }
                boolean choosingExtraMeat = false;
                String extraMeat;
                do {
                    extraMeat = scanner.nextLine();
                    System.out.println("Would you like extra?\n" +
                            "[1] Yes\n" +
                            "[2] No");
                    if (extraMeat.equalsIgnoreCase("1")){
                        choosingExtraMeat = true;
                    } else if (extraMeat.equalsIgnoreCase("2")) {
                        choosingExtraMeat = false;
                    }
                }  while (!extraMeat.equalsIgnoreCase(""));
            }



        //Cheese

            List<String>selectedCheeseToppings = new ArrayList<>();

            boolean choosingCheese = true;

            while (choosingCheese){
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
                    case 5: choosingCheese = false;
                        break;
                    default:
                        System.out.println("Invalid Choice Try Again.");
                }
                boolean choosingExtraCheese = false;
                String extraCheese;
                do {
                    extraCheese = scanner.nextLine();
                    System.out.println("Would you like extra?\n" +
                            "[1] Yes\n" +
                            "[2] No");
                    if (extraCheese.equalsIgnoreCase("1")){
                        choosingExtraCheese = true;
                    } else if (extraCheese.equalsIgnoreCase("2")) {
                        choosingExtraCheese = false;
                    }
                }  while (!extraCheese.equalsIgnoreCase(""));
            }

         //Regular Toppings

            List<String>selectedRegularToppings = new ArrayList<>();

            boolean choosingRegular = true;

            while (choosingRegular){
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
                    case 10: choosingRegular = false;
                        break;
                    default:
                        System.out.println("Invalid Choice Try Again.");
                }
            }

         //Sauce

            List<String>selectedSauceToppings = new ArrayList<>();

            boolean choosingSauce = true;

            while (choosingSauce){
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
                    case 7: choosingSauce = false;
                        break;
                    default:
                        System.out.println("Invalid Choice Try Again.");
                }
            }

        //selectedToppings (selectedMeatToppings, selectedCheeseToppings,selectedRegularToppings,selectedSauceToppings);

        //Toasted

         selectedToasted = false;
        String Toasted;
        do {
            Toasted = scanner.nextLine();
            System.out.println("Would you like your sandwich toasted?\n" +
                    "[1] Yes\n" +
                    "[2] No");
            if (Toasted.equalsIgnoreCase("1")){
                selectedToasted = true;
            } else if (Toasted.equalsIgnoreCase("2")) {
                selectedToasted = false;
            }
        }  while (!Toasted.equalsIgnoreCase(""));

        Sandwich sandwich = new Sandwich(

                selectedSandwichSize,
                selectedBreadType,
                Collections.singletonList(selectedToppings),
                selectedToasted);

         System.out.println("Ight bet, adding sandwich!");//print out sandwich order
        //OrderScreen();
        return sandwich;


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

            option = scanner.nextLine();

            if (option.equalsIgnoreCase("S")) {

                selectedDrinkSize = "Small";

            } else if (option.equalsIgnoreCase("M")) {

                selectedDrinkSize = "Medium";

            } else if (option.equalsIgnoreCase("L")) {

                selectedDrinkSize = "Large";

            } else {

                System.out.println("Invalid Drink Size try again");

            }
        } while (selectedDrinkSize.equalsIgnoreCase(""));

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
                    "Select a Drink Flavor (1-10):\n");
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
        //OrderScreen();
        return drink;

    }

    private Chips AddChips() {
        //ask the user the flavor
        Scanner scanner = new Scanner(System.in);
        String selectedChipsFlavor = "";

        boolean choosingChips = true;

        while (choosingChips) {
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
                    choosingChips = false;
                    break;
                default:
                    System.out.println("Invalid Choice Try Again.");
            }

        }
        //create the chips object
        Chips chips = new Chips(selectedChipsFlavor);

        System.out.println("Ight bet, adding chips!");
        //OrderScreen();
        return chips;

    }

    private SideSauce AddSideSauce(){

        Scanner scanner = new Scanner(System.in);
        String selectedSideSauce = "";

        boolean choosingSideSauce = true;

        while (choosingSideSauce){
            System.out.println("Side Sauce Options:\n" +
                    "1) Mayo\n" +
                    "2) Mustard\n" +
                    "3) Ketchup\n" +
                    "4) Ranch\n" +
                    "5) Thousand Islands\n" +
                    "6) Vinaigrette\n" +
                    "Select a Side Sauce (1-6):");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: selectedSideSauce ="Mayo";
                    break;
                case 2: selectedSideSauce = "Mustard";
                    break;
                case 3: selectedSideSauce = "Ketchup";
                    break;
                case 4: selectedSideSauce = "Ranch";
                    break;
                case 5: selectedSideSauce = "Thousand Islands";
                    break;
                case 6: selectedSideSauce = "Vinaigrette";
                    break;
                case 7: choosingSideSauce = false;
                    break;
                default:
                    System.out.println("Invalid Choice Try Again.");
            }
        }

         SideSauce sideSauce = new SideSauce(selectedSideSauce);
        //figure out how to activate boolean when selected

        System.out.println("Ight bet, adding side sauce!");
        //OrderScreen();
        return sideSauce;
    }

    private CheckOut CheckOut() {

    }

    private void CancelOrder() {

        System.out.println("Are you sure you would like to Cancel your order BRUH?🤓");

        System.out.println("Your Order Has Been Canceled");

    }

    private void Exit() {

        System.out.println("Bye BRUH ✌🏾");

    }

}



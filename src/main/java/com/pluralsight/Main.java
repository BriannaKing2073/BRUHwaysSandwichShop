package com.pluralsight;

import java.util.Scanner;
import java.util.logging.Handler;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        ui.Start();

//        HomeScreen();

    }

    private static void HomeScreen(){

        Scanner scanner = new Scanner(System.in);

        String HomeScreen = "Welcome to BRUHways were we do it the BRUH ways\n" +
                "Please Enter an option BRUH:"+
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

    private static void OrderScreen(){


        Scanner scanner = new Scanner(System.in);

        String OrderScreen = "Let's order the BRUH way, BRUH \n" +
                "Enter your option BRUH:"+
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

                AddDrink();

            } else if (option.equalsIgnoreCase("3")) {

                AddChips();

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

    private static void AddSandwich(){

    }

    private static void AddDrink(){

    }

    private static void AddChips(){

    }

    private static void CheckOut(){

    }

    private static void CancelOrder(){

    }

    private static void Exit(){

        System.out.println("Bye BRUH ✌️");

    }
}
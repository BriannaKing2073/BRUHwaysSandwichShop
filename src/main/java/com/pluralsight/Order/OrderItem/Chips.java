package com.pluralsight.Order.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chips {

    private String chipsFlavor;
    private double chipsPrice;

    //Constructor

    public Chips(String chipsFlavor, double chipsPrice) {
        this.chipsFlavor = chipsFlavor;
        this.chipsPrice = chipsPrice;
    }

    //Getter and Setter
    //Chips Flavor
    public String getChipsFlavor() {
        return chipsFlavor;
    }

    public void setChipsFlavor(String chipsFlavor) {
        this.chipsFlavor = chipsFlavor;
    }
    //Chips Price
    public double getChipsPrice() {
        return chipsPrice;
    }

    public void setChipsPrice(double chipsPrice) {
        this.chipsPrice = chipsPrice;
    }

    public static void ChipsFlavor(){

        Scanner scanner = new Scanner(System.in);
        List<String> selectedChipsFlavor = new ArrayList<>();

        boolean choosing = true;

        while (choosing){
            System.out.println("Chips Flavor Options:\n" +
                    "1) Plain\n" +
                    "2) Salt N Vinegar\n" +
                    "3) Barbecue\n" +
                    "4) Sour Cream and Onion\n" +
                    "5) Flamin' Hot Cheetos\n" +
                    "6) White Cheddar Popcorn\n" +
                    "Select a Chips Flavor (1-6):");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: selectedChipsFlavor.add("Plain");
                    break;
                case 2: selectedChipsFlavor.add("Salt N Vinegar");
                    break;
                case 3: selectedChipsFlavor.add("Barbecue");
                    break;
                case 4: selectedChipsFlavor.add("Sour Cream and Onion");
                    break;
                case 5: selectedChipsFlavor.add("Flamin' Hot Cheetos");
                    break;
                case 6: selectedChipsFlavor.add("White Cheddar Popcorn");
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

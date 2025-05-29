package com.pluralsight.Order.OrderItem.Sandwich;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Toppings {
//Needs Help
    private String meat;
    private String extraMeat;
    private String cheese;
    private String extraCheese;
    private String regularTopping;
    private String sauce;
    private double toppingPrice;

    private void Meat(){

        double meatCost;

        if (sandwichSize.equalsIgnoreCase("4")){
           meatCost = 1.00;
        } else if (sandwichSize.equalsIgnoreCase("8")) {
            meatCost = 2.00;
        } else if (sandwichSize.equalsIgnoreCase("12")) {
            meatCost = 3.0;
        }else {
            //System.out.println("Piece a size any size");
        }
    }
}

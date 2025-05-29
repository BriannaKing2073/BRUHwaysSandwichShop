package com.pluralsight.Order.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drink implements OrderItem{

    private String drinkSize;
    private String drinkFlavor;

    //Constructors

    public Drink(String drinkSize, String drinkFlavor) {
        this.drinkSize = drinkSize;
        this.drinkFlavor = drinkFlavor;
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

    @Override
    public String itemType() {
        return "Drink";
    }

    @Override
    public String itemDescirption() {
        return "Drink ("+ drinkFlavor+ " " + drinkSize +")";
    }

    @Override
    public double itemTotalCost() {
      double sizeCost;
        if (drinkSize.equalsIgnoreCase("S")){
        sizeCost = 2.00;
    } else if (drinkSize.equalsIgnoreCase("M")) {
       sizeCost =  2.50;
    } else if (drinkSize.equalsIgnoreCase("L")) {
        sizeCost = 3.00;
    }else{
           sizeCost = -1;
        }
        return sizeCost;
    }

    }

package com.pluralsight.Order.OrderItem.Sandwich;

import com.pluralsight.Order.OrderItem.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements OrderItem {

    private String sandwichSize;
    private String breadType;
    private boolean toasted;
    private List<Topping> toppings;

    //Constructor

    public Sandwich(String sandwichSize, String breadType,List toppings, boolean toasted) {
        this.sandwichSize = sandwichSize;
        this.breadType = breadType;
        this.toasted = toasted;
        this.toppings = new ArrayList<Topping>();
    }

    //Getters and Setters
    //Sandwich Size
    public String getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }
    //Bread Type
    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    //Add Topping
    public void addTopping(Topping t){
        this.toppings.add(t);
    }

    //Toasted
    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }


    @Override
    public String itemType() {
        return "Sandwich";
    }

    @Override
    public String itemDescirption() {
        return "Sandwich:\n" +
                ""+ breadType + " " + sandwichSize + "\n" +
                "-Toppings-\n" + "Meat";//<--Work in Progress
    }

    @Override
    public double itemTotalCost() {
       //create if statement chain for sandwichCost
      //return = sandwichCost

        return 0;

        //loop through all toppings, ask topping for it's price, add that to the total sandwich price
        //for(Topping t : this.toppings){


        }

//        if (sandwichSize.equalsIgnoreCase("4")){
//            sandwichPrice = 5.50;
//        } else if (sandwichSize.equalsIgnoreCase("8")) {
//            sandwichPrice = 7.00;
//        } else if (sandwichSize.equalsIgnoreCase("12")) {
//            sandwichPrice = 8.50;
//        }else {
//            //System.out.println("Piece a size any size");
//        }
    }


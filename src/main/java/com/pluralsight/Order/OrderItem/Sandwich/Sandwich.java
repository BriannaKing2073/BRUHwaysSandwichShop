package com.pluralsight.Order.OrderItem.Sandwich;

import com.pluralsight.Order.OrderItem.OrderItem;

public class Sandwich implements OrderItem {
//Gotta add Toppings to this
    private String sandwichSize;
    private String breadType;
    private String toppings;
    private boolean toasted;
    private double sandwichPrice; //Might have to remove

    //Constructor

    public Sandwich(String sandwichSize, String breadType,String toppings, boolean toasted, double sandwichPrice) {
        this.sandwichSize = sandwichSize;
        this.breadType = breadType;
        this.toppings = toppings;
        this.toasted = toasted;
        this.sandwichPrice = sandwichPrice;
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
    //Toppings
    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
    //Toasted
    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
    //Sandwich Price
    public double getSandwichPrice() {
        return sandwichPrice;
    }

    public void setSandwichPrice(double sandwichPrice) {
        this.sandwichPrice = sandwichPrice;
    }

    Sandwich sandwich = new Sandwich(sandwichSize,breadType,toppings,toasted,sandwichPrice);

    private void sandwichSize(){

        if (sandwichSize.equalsIgnoreCase("4")){
            sandwichPrice = 5.50;
        } else if (sandwichSize.equalsIgnoreCase("8")) {
            sandwichPrice = 7.00;
        } else if (sandwichSize.equalsIgnoreCase("12")) {
            sandwichPrice = 8.50;
        }else {
            //System.out.println("Piece a size any size");
        }
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
    }
}

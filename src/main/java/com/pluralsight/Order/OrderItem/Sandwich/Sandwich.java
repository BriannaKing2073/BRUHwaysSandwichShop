package com.pluralsight.Order.OrderItem.Sandwich;

public class Sandwich {
//Gotta add Toppings to this
    private String sandwichSize;
    private String breadType;
    private boolean toasted;
    private double sandwichPrice;

    //Constructor

    public Sandwich(String sandwichSize, String breadType, boolean toasted, double sandwichPrice) {
        this.sandwichSize = sandwichSize;
        this.breadType = breadType;
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

    Sandwich sandwich = new Sandwich(sandwichSize,breadType,toasted,sandwichPrice);

    private void sandwichSize(){

        if (sandwichSize.equalsIgnoreCase("4")){
            sandwichPrice = 5.50;
        } else if (sandwichSize.equalsIgnoreCase("8")) {
            sandwichPrice = 7.00;
        } else if (sandwichSize.equalsIgnoreCase("12")) {
            sandwichPrice = 8.50;
        }
    }
}

package com.pluralsight.Order.OrderItem;

public class Drink {

    private String drinkSize;
    private String drinkFlavor;
    private double drinkPrice;

    //Constructors

    public Drink(String drinkSize, String drinkFlavor, double drinkPrice) {
        this.drinkSize = drinkSize;
        this.drinkFlavor = drinkFlavor;
        this.drinkPrice = drinkPrice;
    }

    //Getters and Setters

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public String getDrinkFlavor() {
        return drinkFlavor;
    }

    public void setDrinkFlavor(String drinkFlavor) {
        this.drinkFlavor = drinkFlavor;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
}

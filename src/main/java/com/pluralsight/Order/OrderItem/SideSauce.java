package com.pluralsight.Order.OrderItem;

public class SideSauce implements OrderItem{

    private String sauceName;
   // private boolean isSide;

    //Constructor

    public SideSauce(String sauceName) {
        this.sauceName = sauceName;
       // this.isSide = isSide;
    }

    //Getters and Setters
    //Sauce Name
    public String getSauceName() {
        return sauceName;
    }

    public void setSauceName(String sauceName) {
        this.sauceName = sauceName;
    }


    @Override
    public String itemType() {
        return "Side Sauce";
    }

    @Override
    public String itemDescirption() {
        return "Side Sauce (" + this.sauceName + ")";
    }

    @Override
    public double itemTotalCost() {
        return 0;
    }
}

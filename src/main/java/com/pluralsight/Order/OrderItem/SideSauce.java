package com.pluralsight.Order.OrderItem;

public class SideSauce {

    private String sauceName;
    private boolean isSide;

    //Constructor

    public SideSauce(String sauceName, boolean isSide) {
        this.sauceName = sauceName;
        this.isSide = isSide;
    }

    //Getters and Setters
    //Sauce Name
    public String getSauceName() {
        return sauceName;
    }

    public void setSauceName(String sauceName) {
        this.sauceName = sauceName;
    }
    //Is Side?
    public boolean isSide() {
        return isSide;
    }

    public void setSide(boolean side) {
        isSide = side;
    }
}

package com.pluralsight.Order.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chips implements OrderItem {

    private String chipsFlavor;

    //Constructor

    public Chips(String chipsFlavor) {
        this.chipsFlavor = chipsFlavor;
    }

    //Getter and Setter
    public String getChipsFlavor() {
        return chipsFlavor;
    }

    public void setChipsFlavor(String chipsFlavor) {
        this.chipsFlavor = chipsFlavor;
    }

    //Implementation of Order Item
    @Override
    public String itemType() {
        return "Chip";
    }

    @Override
    public String itemDescirption() {
        return "Chips (" + this.chipsFlavor + ")";
    }

    @Override
    public double itemTotalCost() {
        return 1.50;
    }

}

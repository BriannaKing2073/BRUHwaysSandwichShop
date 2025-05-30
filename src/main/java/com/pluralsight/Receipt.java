package com.pluralsight;

import com.pluralsight.Order.OrderItem.OrderItem;

import java.util.List;

public class Receipt {

    private String sandwichShop;
    private String orderName;
    private String order;
    private String orderTotal;

    //create a builder string to create a receipt

    // Constructor
    public Receipt(String sandwichShop, String orderName, String order, String orderTotal) {
        this.sandwichShop = sandwichShop;
        this.orderName = orderName;
        this.order = order;
        this.orderTotal = orderTotal;
    }

    public Receipt(List<OrderItem> items) {
    }

    // Getters
    public String getSandwichShop() {
        return sandwichShop;
    }

    public String getOrderName() {
        return orderName;
    }

    public String getOrder() {
        return order;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    // Setters
    public void setSandwichShop(String sandwichShop) {
        this.sandwichShop = sandwichShop;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    // Print  Receipt
    public void printReceipt() {
        System.out.println("=====================================");
        System.out.println("          " + sandwichShop);
        System.out.println("=====================================");
        System.out.println("Order for: " + orderName);
        System.out.println("Items: " + order);
        System.out.println("Total: $" + orderTotal);
        System.out.println("=====================================");
        System.out.println("     Thank you for your order!");
        System.out.println("=====================================");
    }

    public void print() {
    }

    public void saveToFile() {
    }
}


package com.pluralsight.Order.OrderItem;

public class SandwichShop {

    private String shopName;
    private String shopAddress;
    private String shopPhoneNumber;
    private String shopSlogan;

    //Constructor

    public SandwichShop(String shopName, String shopAddress, String shopPhoneNumber, String shopSlogan) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopPhoneNumber = shopPhoneNumber;
        this.shopSlogan = shopSlogan;
    }

    //Getters and Setters
    //Shop Name
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = "BRUHways Sandwich Shop";
    }
    //Shop Address
    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = "1800 Sandwich Way, Adell, WI, 53001";
    }
    //Shop Phone Number
    public String getShopPhoneNumber() {
        return shopPhoneNumber;
    }

    public void setShopPhoneNumber(String shopPhoneNumber) {
        this.shopPhoneNumber = "1(800)BRUHway aka 1(800)278-4929";
    }
    //Shop Slogan
    public String getShopSlogan() {
        return shopSlogan;
    }

    public void setShopSlogan(String shopSlogan) {
        this.shopSlogan = "Welcome to BRUHways were we do it the BRUH ways";
    }
}

package com.pluralsight.Order.OrderItem.Sandwich;

public class Topping {
//Needs Help

    private String toppingType; //(Meat,Cheese,Regular, and Sauce)
    private String toppingName;
    private boolean extra; //(yes or no)

    public Topping(String toppingType, String toppingName, boolean extra) {
        this.toppingType = toppingType;
        this.toppingName = toppingName;
        this.extra = extra;
    }

    public String getToppingType() {
        return toppingType;
    }

    public String getToppingName() {
        return toppingName;
    }

    public boolean isExtra() {
        return extra;
    }

    public double getPrice(String sandwichSize){

        //three factors to calculate price:
        // size of sandwhich sandwhichSize
        // type of sandwhich (meat, cheese, anything else)
        // is there extra?

        double calculatedPrice = 0;
        double sizePrice;
        double toppingCost;
        double extraCost;

        if (sandwichSize.equalsIgnoreCase("4")){

            sizePrice = 5.50;

            if (toppingType.equalsIgnoreCase("Meat")){

                toppingCost = 1.00;

                if (isExtra() == true){

                    extraCost = 0.50;

                    calculatedPrice = sizePrice + toppingCost + extraCost;

                } else if (isExtra() == false) {

                    calculatedPrice = sizePrice + toppingCost;

                } else {

                    calculatedPrice = sizePrice;

                }
            } else if (toppingType.equalsIgnoreCase("Cheese")) {

                toppingCost = 0.75;

                if (isExtra() == true){

                    extraCost = 0.30;

                    calculatedPrice = sizePrice + toppingCost + extraCost;

                } else if (isExtra() == false) {

                    calculatedPrice = sizePrice + toppingCost;

                } else {

                    calculatedPrice = sizePrice;

                }

            }
        }

        else if (sandwichSize.equalsIgnoreCase("8")) {

            sizePrice = 7.00;

            if (toppingType.equalsIgnoreCase("Meat")){

                toppingCost = 2.00;

                if (isExtra() == true){

                    extraCost = 1.00;

                    calculatedPrice = sizePrice + toppingCost + extraCost;

                } else if (isExtra() == false) {

                    calculatedPrice = sizePrice + toppingCost;

                } else {

                    calculatedPrice = sizePrice;

                }
            } else if (toppingType.equalsIgnoreCase("Cheese")) {

                toppingCost = 1.50;

                if (isExtra() == true){

                    extraCost = 0.60;

                    calculatedPrice = sizePrice + toppingCost + extraCost;

                } else if (isExtra() == false) {

                    calculatedPrice = sizePrice + toppingCost;

                } else {

                    calculatedPrice = sizePrice;

                }

            }

            }

        else if (sandwichSize.equalsIgnoreCase("12")) {

            sizePrice = 8.50 ;

            if (toppingType.equalsIgnoreCase("Meat")){

                toppingCost = 3.00;

                if (isExtra() == true){

                    extraCost = 1.50;

                    calculatedPrice = sizePrice + toppingCost + extraCost;

                } else if (isExtra() == false) {

                    calculatedPrice = sizePrice + toppingCost;

                } else {

                    calculatedPrice = sizePrice;

                }
            } else if (toppingType.equalsIgnoreCase("Cheese")) {

                toppingCost = 2.25;

                if (isExtra() == true){

                    extraCost = 0.90;

                    calculatedPrice = sizePrice + toppingCost + extraCost;

                } else if (isExtra() == false) {

                    calculatedPrice = sizePrice + toppingCost;

                } else {

                    calculatedPrice = sizePrice;

                }

            }



        }


        return calculatedPrice;
    }
}

package com.pluralsight.Order;

import com.pluralsight.Order.OrderItem.Chips;
import com.pluralsight.Order.OrderItem.Drink;
import com.pluralsight.Order.OrderItem.OrderItem;
import com.pluralsight.Order.OrderItem.Sandwich.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();

    private String orderName;

    public void addOrderItem(OrderItem item){

        orderItems.add(item);

    }

    public List<Sandwich> getSandwiches() {
    }

    public List<Drink> getDrinks() {
    }

    public List<Chips> getChips() {
    }
}


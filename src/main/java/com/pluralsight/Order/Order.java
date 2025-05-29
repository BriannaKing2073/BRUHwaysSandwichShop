package com.pluralsight.Order;

import com.pluralsight.Order.OrderItem.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();

    private String orderName;

    public void addOrderItem(OrderItem item){

        orderItems.add(item);

    }
}


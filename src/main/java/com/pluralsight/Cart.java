package com.pluralsight;

import com.pluralsight.Order.OrderItem.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<OrderItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public List<OrderItem> getItems() {
        return new ArrayList<>(items);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (OrderItem item : items) {
            total += item.itemTotalCost();
        }
        return total;
    }

    public void clearCart() {
        items.clear();
    }
}

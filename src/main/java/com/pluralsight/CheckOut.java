package com.pluralsight;

import com.pluralsight.Order.Order;
import com.pluralsight.Order.OrderItem.OrderItem;

import java.util.List;

public class CheckOut {

    private Cart cart;

    public CheckOut(Cart cart) {
        this.cart = cart;
    }

    public void processOrder() {
        List<OrderItem> items = cart.getItems();
        if (items.isEmpty()) {
            System.out.println("Your cart is empty. Please add items before checking out.");
            return;
        }

        Receipt receipt = new Receipt(items);
        receipt.print();

        // Optionally, create an Order object if needed
        // Order order = new Order(items);

        cart.clearCart();
        System.out.println("Thank you for your purchase!");
    }
    }



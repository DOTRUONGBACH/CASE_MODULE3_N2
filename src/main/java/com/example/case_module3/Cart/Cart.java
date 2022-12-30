package com.example.case_module3.Cart;

import com.example.case_module3.models.Hat;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Hat hat;
    private double discount;
    private double total;

private List<CartItem> items = null;

    public Cart(Hat hat, double discount, double total, List<CartItem> items) {
        this.hat = hat;
        this.discount = discount;
        this.total = total;
        this.items = items;
    }

    public Cart() {
    }

    public Hat getHat() {
        return hat;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }
}

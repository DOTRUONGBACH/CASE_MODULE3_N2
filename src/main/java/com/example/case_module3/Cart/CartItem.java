package com.example.case_module3.Cart;

import com.example.case_module3.models.Hat;

public class CartItem {
    private Hat hat;
    private double sellPrice;
    private int quantity;
    private double totalCost;

    public CartItem(Hat hat, double sellPrice, int quantity, double totalCost) {
        this.hat = hat;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public CartItem() {
    }

    public Hat getHat() {
        return hat;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    public void calculateSellprice(){
setSellPrice(hat.getSellPrice()-(hat.getSellPrice()* hat.getSellPrice()/100));
    }
    public void calculateTotalcost(){
        calculateSellprice();
        setTotalCost(quantity*sellPrice);
    }
}

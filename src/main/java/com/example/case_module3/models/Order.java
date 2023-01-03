package com.example.case_module3.models;

import java.sql.Date;

public class Order {
    private int idOrder;
    private Date orderDate;
    private boolean orderStatus;
    private int customerId;
    private double discount;
    private int countBuy;

    public Order() {
    }

    public Order(int idOrder, Date orderDate, boolean orderStatus, int customerId, double discount, int countBuy) {
        this.idOrder = idOrder;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.customerId = customerId;
        this.discount = discount;
        this.countBuy = countBuy;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getCountBuy() {
        return countBuy;
    }

    public void setCountBuy(int countBuy) {
        this.countBuy = countBuy;
    }
}

package com.example.case_module3.models;

public class OrderDetail {
    private int idOrder;
    private int hatId;
    private String hatName;
    private int quantity;

    public OrderDetail(int idOrder, int hatId, String hatName, int quantity) {
        this.idOrder = idOrder;
        this.hatId = hatId;
        this.hatName = hatName;
        this.quantity = quantity;
    }

    public OrderDetail() {
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getHatId() {
        return hatId;
    }

    public void setHatId(int hatId) {
        this.hatId = hatId;
    }

    public String getHatName() {
        return hatName;
    }

    public void setHatName(String hatName) {
        this.hatName = hatName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

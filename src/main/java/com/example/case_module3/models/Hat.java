package com.example.case_module3.models;

import java.util.Collections;
import java.util.List;

public class Hat {
private int hatId;
private String hatName;
private String img;
private List<String> listImg = null;
private double sellPrice;
private double inputPrice;
private double promotionPrice;
private int quantity;
private String description;
private String detail;
private int idHattype;
private int idCatagory;

    public Hat() {
    }

    public Hat(int hatId, String hatName, String img, List<String> listImg, double sellPrice, double inputPrice, double promotionPrice, int quantity, String description, String detail, int idHattype, int idCatagory) {
        this.hatId = hatId;
        this.hatName = hatName;
        this.img = img;
        this.listImg = listImg;
        this.sellPrice = sellPrice;
        this.inputPrice = inputPrice;
        this.promotionPrice = promotionPrice;
        this.quantity = quantity;
        this.description = description;
        this.detail = detail;
        this.idHattype = idHattype;
        this.idCatagory = idCatagory;
    }

    public Hat(String hatName, String img, String listImg, double sellPrice, double inputPrice, double promotionPrice, int quantity, String description, String detail) {

        this.hatName = hatName;
        this.img = img;
        this.listImg = Collections.singletonList(listImg);
        this.sellPrice = sellPrice;
        this.inputPrice = inputPrice;
        this.promotionPrice = promotionPrice;
        this.quantity = quantity;
        this.description = description;
        this.detail = detail;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<String> getListImg() {
        return listImg;
    }

    public void setListImg(List<String> listImg) {
        this.listImg = listImg;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getInputPrice() {
        return inputPrice;
    }

    public void setInputPrice(double inputPrice) {
        this.inputPrice = inputPrice;
    }

    public double getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(double promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getIdHattype() {
        return idHattype;
    }

    public void setIdHattype(int idHattype) {
        this.idHattype = idHattype;
    }

    public int getIdCatagory() {
        return idCatagory;
    }

    public void setIdCatagory(int idCatagory) {
        this.idCatagory = idCatagory;
    }
}

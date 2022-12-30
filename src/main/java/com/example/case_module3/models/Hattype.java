package com.example.case_module3.models;

public class Hattype {
    private int idHattype;
    private String typeName;

    public Hattype() {
    }

    public Hattype(int idHattype, String typeName) {
        this.idHattype = idHattype;
        this.typeName = typeName;
    }

    public int getIdHattype() {
        return idHattype;
    }

    public void setIdHattype(int idHattype) {
        this.idHattype = idHattype;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}

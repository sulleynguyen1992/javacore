/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.model;

/**
 *
 * @author nguye
 */
public class Product {
    private String code;
    private String name;
    private double unitPrice;
    private String madeIn;

    public Product() {
        super();
    }
    
    public Product(String code, String name, double unitPrice, String madeIn) {
        super();
        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.madeIn = madeIn;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getMadeIn() {
        return madeIn;
    }

    @Override
    public String toString() {
        return this.code + " - " + this.name + " - " + this.unitPrice  + " - " 
                + this.madeIn;
    }
    
    
}

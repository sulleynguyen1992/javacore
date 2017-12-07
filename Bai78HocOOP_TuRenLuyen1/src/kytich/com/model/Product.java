/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.model;

/**
 *
 * @author sulleynguyen
 */
public class Product {
    private int code;
    private String productName;
    private double price;
    private String madeIn;

    public Product() {
        super();
    }

    public Product(int code, String productName, double price, String madeIn) {
        this.code = code;
        this.productName = productName;
        this.price = price;
        this.madeIn = madeIn;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getCode() {
        return code;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getMadeIn() {
        return madeIn;
    }
    
    
}

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
public class Product implements Comparable<Product>{
    private int code;
    private String name;
    private double price;

    public Product() {
        super();
    }

    public Product(int code, String name, double price) {
        super();
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.code + "\t" + this.name + "\t" + this.price;
    }

    @Override
    public int compareTo(Product o) {
        if(this.price < o.price){
            return -1;
        }
        if(this.price > o.price)
            return 1;
//        this.name.compareToIgnoreCase(o.name)*-1;
        return 0;
    }
    
    
    
}

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
    private String name;
    private double price;
    
    public Product(){
    
    }
    public Product(int code, String name, double price){
        this.code = code;
        this.name = name;
        this.price = price;
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

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name=" + name + ", price=" + price + '}';
    }
    public static double sumPrice(Product ...product){
        double price = 0;
        for(Product pr : product){
            price+= pr.price;
        }
        return price;
    }
}

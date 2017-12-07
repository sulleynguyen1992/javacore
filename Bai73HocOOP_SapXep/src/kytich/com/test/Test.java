/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import java.util.ArrayList;
import java.util.Collections;
import kytich.com.model.Product;

/**
 *
 * @author sulleynguyen
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Coke", 20000));
        products.add(new Product(2,"Fanta",15000));
        products.add(new Product(3, "7up", 14000));
        
        System.out.println("Products List:");
        for(Product pr : products){
            
            System.out.println(pr);
        }
        Collections.sort(products);
        System.out.println("Products List after sort: ");
        for(Product pr : products){
            System.out.println(pr);
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import kytich.com.model.Product;

/**
 *
 * @author sulleynguyen
 */
public class TestProduct {

    public static void main(String[] args) {
        Product coca = new Product(1, "Coca Cola", 5000);
        Product hambuger = new Product(2, "Humberger", 15000);
        Product snack = new Product(3, "Snack", 20000);
        double sumPrice = Product.sumPrice(coca, hambuger, snack);
        System.out.println("sum price: " + sumPrice);

        double sumPrice2 = Product.sumPrice(coca, hambuger);
        System.out.println("sum price 2: " + sumPrice2);
    }
}

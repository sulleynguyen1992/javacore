/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import java.util.Scanner;
import kytich.com.model.Category;
import kytich.com.model.ListCategory;
import kytich.com.model.Product;

/**
 *
 * @author sulleynguyen
 */
public class Test {
    static private Product productItem;
    static private Category categoryItem;
    static private ListCategory listCategory = new ListCategory();

    public static void menu() {
        System.out.println("1. Add Category");
        System.out.println("2. Add Product");
        System.out.println("7. Exit");
        System.out.println("Choose function you need: ");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                addCategory();
                break;
            case 2:
                addProduct();
                break;
            default:
                System.out.println("Wrong way?");
                break;
        }
    }

    private static void addCategory() {
        System.out.println("Enter the category id: ");
        int value = new Scanner(System.in).nextInt();
        System.out.println("Enter the category name: ");
        String name = new Scanner(System.in).nextLine();
        categoryItem = new Category(value, name);
        listCategory.addCategory(categoryItem);

    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    private static void addProduct() {
        System.out.println("Enter the product id: ");
        int value = new Scanner(System.in).nextInt();
        System.out.println("Enter the category name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Enter the category Price: ");
        double price = new Scanner(System.in).nextDouble();
        System.out.println("Enter the category made in: ");
        String madeIn = new Scanner(System.in).nextLine();
        productItem = new Product(value, name, price, madeIn);
        categoryItem.addProduct(productItem);

    }
}

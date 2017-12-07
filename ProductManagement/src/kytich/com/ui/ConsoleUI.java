/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.ui;

import java.util.Scanner;
import kytich.com.model.Category;
import kytich.com.model.Product;

/**
 *
 * @author nguye
 */
public class ConsoleUI {
    final private Scanner sc;
    final private Category category;
    //private Product productItem;
    public ConsoleUI(){       
        category= new Category();
        sc = new Scanner(System.in);
    }
    private int menu(){
        int choice = 0;
        System.out.println("---PRODUCT MENU---");
        System.out.println("1. Add product");
        System.out.println("2. Show all product");
        System.out.println("3. Remove product");
        System.out.println("0. Exit");
        choice = sc.nextInt();
        return choice;
        
    }
    public void start() {
        while (true) {
            int choice = menu();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    addProduct();
                    break;
                case 2:
                    showAllProduct();
                    break;
                default:
                    System.out.println("faild");
            }
        }
    }

    public void addProduct() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter product Code: ");
        String code = sc1.nextLine();
        System.out.println("Enter product name:");
        String name = sc1.nextLine();
        System.out.println("Enter product price:");
        double price  = sc1.nextDouble();
        System.out.println("Enter product made in:");
        String madeIn  = sc1.next();
        
        Product product = new Product(code, name, price, madeIn);
        this.category.addProduct(product);
    }

    private void showAllProduct() {
        this.category.showAllProduct();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import java.util.Scanner;
import kytich.com.model.Employee;

/**
 *
 * @author sulleynguyen
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1, e2;
        System.out.println("Enter the Employee 1 Information: ");
        System.out.println("Enter the first name: ");
        String firstName1 = new Scanner(System.in).nextLine();
        System.out.println("Enter the last name: ");
        String lasttName1 = new Scanner(System.in).nextLine();
        System.out.println("Enter the number of products");
        int numberOfProduct1 = new Scanner(System.in).nextInt();
        
        e1 = new Employee(firstName1, lasttName1, numberOfProduct1);
        
        System.out.println("Enter the Employee 2 Information: ");
        System.out.println("Enter the first name: ");
        String firstName2 = new Scanner(System.in).nextLine();
        System.out.println("Enter the last name: ");
        String lasttName2 = new Scanner(System.in).nextLine();
        System.out.println("Enter the number of products");
        int numberOfProduct2 = new Scanner(System.in).nextInt();
       
        e2 = new Employee(firstName2, lasttName2, numberOfProduct2);
        
        System.out.println("Salary of Employee 1 " + e1.getSalary());
        System.out.println("Salary of Employee 2 " + e2.getSalary());
        
        if(e1.GreateThan(e2)){
            System.out.println("Employee ["+e1.getFirstName()+" "
                    + ""+e1.getLastName()+"] greate number of product");
            System.out.println("Detail: " + (e1.getNumberOfProduct() - e2.getNumberOfProduct()) + " Product");
        }else{
            System.out.println("Employee ["+e2.getFirstName()+" "
                    + ""+e2.getLastName()+"] greate number of product");
            System.out.println("Detail: " + (e2.getNumberOfProduct() - e1.getNumberOfProduct()) + " Product");
        }
        
    }
}

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
public class Employee {
    private String FirstName;
    private String LastName;
    private int numberOfProduct;

    public Employee(String FirstName, String LastName, int numberOfProduct) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.numberOfProduct = numberOfProduct;
        if(numberOfProduct < 0){
            this.numberOfProduct = 0;
        }
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }
    public double getSalary(){
        double rate = 0;
        if(this.numberOfProduct < 199){
            rate = 0.5;
        }else if(this.numberOfProduct <= 399){
            rate = 0.55;
        }else if(this.numberOfProduct <= 599){
            rate = 0.6;
        }else{
            rate = 0.65;
        }
        return rate * this.numberOfProduct;
    }
    public boolean GreateThan(Employee e){
        return this.numberOfProduct > e.numberOfProduct;
    }
    
}

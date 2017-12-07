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
public class Employee extends StaffMember {

    protected String socialSercurityNumber;
    protected double payRate;

    public void setSocialSercurityNumber(String socialSercurityNumber) {
        this.socialSercurityNumber = socialSercurityNumber;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getSocialSercurityNumber() {
        return socialSercurityNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    
    @Override
    public String toString() {
        return super.toString() + " - " + this.socialSercurityNumber + " - "
                + this.payRate; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double pay() {
        return 500;
    }

}

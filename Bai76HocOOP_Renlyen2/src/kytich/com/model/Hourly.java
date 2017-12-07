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
public class Hourly extends Employee{
    private int hoursWork;
    
    public void addHours(int hoursWork){
        this.hoursWork = hoursWork;
    }

    @Override
    public double pay() {
        return this.hoursWork * 50;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

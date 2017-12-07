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
public class Executive extends Employee{
    private double bonus;
    public void awardBonus(double bonus){
        this.bonus = bonus;
        System.out.println("Get= "+bonus);
    }

    @Override
    public double pay() {
        return super.pay() + this.bonus; //To change body of generated methods, choose Tools | Templates.
    }
    
}

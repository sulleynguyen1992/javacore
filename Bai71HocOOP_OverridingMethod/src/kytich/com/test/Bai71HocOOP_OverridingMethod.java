/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import kytich.com.model.FulltimeEmployee;

/**
 *
 * @author sulleynguyen
 */
public class Bai71HocOOP_OverridingMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FulltimeEmployee tranVanA = new FulltimeEmployee(01, "Tran Van A");
        
        tranVanA.salaryCalulate(20);
    }
    
}

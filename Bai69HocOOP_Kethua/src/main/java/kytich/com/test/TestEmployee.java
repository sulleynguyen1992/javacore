/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import kytich.com.model.FulltimeEmployee;
import kytich.com.model.InternShipEmployee;
import kytich.com.model.ParttimeEmployee;

/**
 *
 * @author sulleynguyen
 */
public class TestEmployee {
    public static void main(String[] args) {
        FulltimeEmployee nguyenVanA = new FulltimeEmployee(01, "Nguyen Van A");
        ParttimeEmployee tranThiB = new ParttimeEmployee(02, "Tran Thi B");
        InternShipEmployee internShipEmployee = new InternShipEmployee(03, "Googling");
        
        nguyenVanA.salaryCalculate();
        tranThiB.salaryCalculate();
        internShipEmployee.salaryCalculate();
                
    }
}

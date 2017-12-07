/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import kytich.com.model.Employee;
import kytich.com.model.Executive;
import kytich.com.model.Staff;

/**
 *
 * @author sulleynguyen
 */
public class TestStaff {

    public static void main(String[] args) {
        Staff staff = new Staff();
        Employee vanTeo = new Employee();
        vanTeo.setName("Tran van Teo");
        vanTeo.setAddress("Nam Tu Liem");
        vanTeo.setPhone("12345");
        vanTeo.setPayRate(0.12);
        vanTeo.setSocialSercurityNumber("123number");
        
        staff.addStaffMember(vanTeo);
        
        Employee vanTy = new Employee();
        vanTy.setName("Tran van Ty");
        vanTy.setAddress("Bac Tu Liem");
        vanTy.setPhone("12345789");
        vanTy.setPayRate(0.24);
        vanTy.setSocialSercurityNumber("456Number");
        
        staff.addStaffMember(vanTy);
        
        Executive an = new Executive();
        an.setName("Tran van An");
        an.setAddress("Cau Giay");
        an.setPhone("09666666");
        an.setPayRate(0.1);
        an.setSocialSercurityNumber("Sec1234");
        an.awardBonus(100);
        staff.addStaffMember(an);
        
        staff.payDay();
        
    }
}

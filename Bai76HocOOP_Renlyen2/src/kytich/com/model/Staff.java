/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.model;

import java.util.ArrayList;

/**
 *
 * @author sulleynguyen
 */
public class Staff {
    private ArrayList<StaffMember> staffList;

    public Staff() {
        super();
        staffList = new ArrayList<StaffMember>();
    }

    
    public void setStaffList(ArrayList<StaffMember> staffList) {
        this.staffList = staffList;
    }

    public ArrayList<StaffMember> getStaffList() {
        return staffList;
    }
    
    public void addStaffMember(StaffMember staffMember){
        staffList.add(staffMember);
    }
    public void payDay(){
        for(StaffMember sm : staffList){
            System.out.println(sm);
        }
    }
    
}

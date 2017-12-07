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
public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember() {
        super();
    }
    
    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
    @Override
    public String toString() {
        return this.name +  " - " + this.phone + " - " + this.address;
    }
    
    public abstract double pay();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.model;

import java.util.Date;

/**
 *
 * @author sulleynguyen
 */
public abstract class Person implements Mammal{

    private String firstName;
    private BloodGroup blood;
    private Address homeAdd;
    private Address schoolAdd;
    private Date doB;
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setBlood(BloodGroup blood) {
        this.blood = blood;
    }

    public void setHomeAdd(Address homeAdd) {
        this.homeAdd = homeAdd;
    }

    public void setSchoolAdd(Address schoolAdd) {
        this.schoolAdd = schoolAdd;
    }

    public String getBlood() {
        return blood.getBloodName();
    }

    public Address getHomeAdd() {
        return homeAdd;
    }

    public Address getSchoolAdd() {
        return schoolAdd;
    }
    
    @Override
    public void setDateOfBirth(Date dob) {
        this.doB = dob;
    }

    @Override
    public int getAgesAsDays() {
        return 0;
    }
    
}

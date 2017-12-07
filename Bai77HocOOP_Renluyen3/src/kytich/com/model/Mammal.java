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
public interface Mammal {
    public void setDateOfBirth(Date dob);
    public int getAgesAsDays();
}

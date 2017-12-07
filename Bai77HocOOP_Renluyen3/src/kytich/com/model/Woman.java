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
public class Woman extends Person{
    private boolean wearingMakeup;

    public void setWearingMakeup(boolean wearingMakeup) {
        this.wearingMakeup = wearingMakeup;
    }

    public boolean isWearingMakeup() {
        return wearingMakeup;
    }
    
    
}

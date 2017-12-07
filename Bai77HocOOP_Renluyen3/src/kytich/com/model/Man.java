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
public class Man extends Person{
    private boolean watchingFooball;

    public void setWatchingFooball(boolean watchingFooball) {
        this.watchingFooball = watchingFooball;
    }

    public boolean isWatchingFooball() {
        return watchingFooball;
    }
    
    
}

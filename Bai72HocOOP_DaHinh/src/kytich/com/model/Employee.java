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
public class Employee implements IDoAble{

    @Override
    public void doSomeThing() {
        System.out.println("Employee do something");
    }
    
}

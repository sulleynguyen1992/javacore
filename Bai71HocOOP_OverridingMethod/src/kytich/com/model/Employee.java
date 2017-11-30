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
public abstract class Employee {
    private int code;
    private String name;
    
    public Employee(){
        super();
    }
    public Employee(int code, String name){
        this.code = code;
        this.name = name;
    }
    public void setCode(int code){
        this.code = code;
    }
    public int getCode(){
        return this.code;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public abstract void salaryCalulate(int workDay);
}

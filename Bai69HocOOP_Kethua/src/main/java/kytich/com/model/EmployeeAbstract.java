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
public abstract class EmployeeAbstract {
    private int code;
    private String name;

    public EmployeeAbstract() {
        super();
    }

    public EmployeeAbstract(int ma, String name) {
        this.code = ma;
        this.name = name;
    }
    public int getMa() {
        return code;
    }

    public void setMa(int ma) {
        this.code = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void salaryCalculate();
    
}

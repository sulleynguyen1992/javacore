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
public class FulltimeEmployee extends Employee{
    public FulltimeEmployee(){
        super();
    }
    public FulltimeEmployee(int code, String name){
        super(code, name);
    }
    
    @Override
    public void salaryCalculate(){
        super.salaryCalculate();
        System.out.println("Employee " + this.name +  " this is fulltime employee");
    }
}

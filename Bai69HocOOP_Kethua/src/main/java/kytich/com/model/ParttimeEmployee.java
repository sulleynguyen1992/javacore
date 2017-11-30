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
public class ParttimeEmployee extends Employee{
    public ParttimeEmployee(){
        super();
    }
    public ParttimeEmployee(int code, String name){
        super(code, name);
    } 

    @Override
    public void salaryCalculate() {
        super.salaryCalculate(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Employee "+ this.name +" This is partime empyee");
    }
    
}

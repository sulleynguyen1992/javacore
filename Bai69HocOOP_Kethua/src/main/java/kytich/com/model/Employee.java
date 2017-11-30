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
public class Employee extends EmployeeAbstract{
   protected int code;
   protected String name;
   
   public Employee(){
       
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
   
   @Override
   public void setName(String name){
       this.name = name;
   }
   @Override
   public String getName(){
       return this.name;
   }
   @Override
   public void salaryCalculate(){
       System.out.println("Calculate salary employee");
   }
}

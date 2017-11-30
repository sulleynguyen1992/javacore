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

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(int code, String name) {
        super(code, name);
    }

    @Override
    public void salaryCalulate(int workDay) {
        
        if (workDay < 20) {
            System.out.println("salary without bonus: " + workDay * 2 + " milion vnd");
        }else{
            System.out.println("salary with bonus: " + ((workDay * 2)+20) + " milion vnd");
        }
    }
    
}

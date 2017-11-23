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
public class Student {
    private int codeId;
    private String studentName;
    private double grade;
    
    public Student(){
    
    }
    
    public Student(int codeId){
        this();
        this.codeId = codeId;
    }
    public Student(int codeId, String studentName){
        this(codeId);
        this.studentName = studentName;
    }
    public Student(int codeId, String studentName, double grade){
        this(codeId,studentName);
        this.grade = grade;
    }
    public void xetTotNghiep(){
        if(this.grade > 5){
            System.out.println("Succesfull!");
        }else{
            System.out.println("Fail!!!!");
        }
    }
    //overloading method setTopNghiep()
    public void xetTotNghiep(double grade){
        System.out.println("You have grade: " + grade);
    }
    public void xetTotNghiep(double grade, int countryCode){
         System.out.println("You have grade: " + grade + 
                 " with country code: " + countryCode);
    }
    public void dangKyHocPhan(int courseId){
    
    }
    public void dangKyHocPhan(String courseName){
    
    }
}

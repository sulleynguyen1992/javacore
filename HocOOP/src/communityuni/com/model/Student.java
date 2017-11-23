/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communityuni.com.model;

/**
 *
 * @author sulleynguyen
 */
public class Student {

    private String nameStudent;
    private double grade;
    //constructor mac dinh
    public Student() {
        System.out.println("This is default constructor");
    }
    //constructor co doi so
    public Student(String nameStudent, double grade) {
        this.nameStudent = nameStudent;
        this.grade = grade;
        System.out.println("this is parameter constructor");
    }
    public void setNameStudent(String nameStudent){
        this.nameStudent = nameStudent;
    }
    public String getNameStudent(){
        return this.nameStudent;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public double getGrade(){
        return this.grade;
    }
    
    public void exportInformation(){
        System.out.println("Name: " + this.nameStudent + "\t" + "Grade: " + this.grade);
    }

    @Override
    public String toString() {
        return "Name = " + this.nameStudent + "\nGrade: " + this.grade; 
    }
    

}

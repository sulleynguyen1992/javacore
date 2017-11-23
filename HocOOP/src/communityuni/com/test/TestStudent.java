/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communityuni.com.test;

import communityuni.com.model.Student;

/**
 *
 * @author sulleynguyen
 */
public class TestStudent {
    public static void main(String[] args) {
        Student obama = new Student();       
        obama.setNameStudent("KemKem");
        
        Student putin = new Student("Putin", 8.5);
        System.out.println("name: " + putin.getNameStudent());
        System.out.println("Putin grade: "+putin.getGrade());
        
        putin.exportInformation();
        System.out.println("-----------------------");
        System.out.println(putin);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import java.util.ArrayList;
import kytich.com.model.Student;

/**
 *
 * @author sulleynguyen
 */
public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Van A", 6.5));
        students.add(new Student(2, "Le B", 8.9));
        students.add(new Student(3, "Nguyen Tran Hanh Linh", 10));
        students.add(new Student(4, "Ca Rot", 3));
        
        System.out.println("Student List: ");
        for(Student student : students){
            System.out.println(student);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import kytich.com.model.Student;

/**
 *
 * @author sulleynguyen
 */
public class TestStudent {
    public static void main(String[] args) {
        Student nguyentracthang = new Student(110,"Nguyen Trac Thang", 9);
        nguyentracthang.xetTotNghiep();
        nguyentracthang.xetTotNghiep(4);
        nguyentracthang.xetTotNghiep(3, 2);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import kytich.com.model.NhanVien;

/**
 *
 * @author sulleynguyen
 */
public class TestNhanVien {
    public static void main(String[] args) {
        NhanVien nhanvien1 = new NhanVien(1, "Obama");
        NhanVien nhanvien2 = new NhanVien(2, "Trump");
        
        System.out.println("-----first name------");
        System.out.println("nhan vien 1: " + nhanvien1.getName());
        System.out.println("nhan vien 2: " + nhanvien2.getName());
        
        nhanvien1 = nhanvien2;
        System.out.println("------------------------");
        nhanvien1.setName("ThangNT");
        
        System.out.println("nhan vien 2: " + nhanvien2.getName());
        
        nhanvien2.setName("King Glory");
        System.out.println("nhan vien 1: "+ nhanvien1.getName());
        
        System.out.println("-------clone instance object----------");
        NhanVien nhanvien3 = new NhanVien(3, "Object 3");
        NhanVien nhanvien4 = new NhanVien(4, "Biscuit");
        
        nhanvien3 = nhanvien4.copy();
        
        System.out.println("nhan vien 3: "+ nhanvien3.getName());
        
        nhanvien4.setName("Bibica");
    }
}

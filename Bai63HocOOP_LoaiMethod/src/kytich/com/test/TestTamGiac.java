/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import kytich.com.model.TamGiac;

/**
 *
 * @author sulleynguyen
 */
public class TestTamGiac {
    public static void main(String[] args) {
        TamGiac tamGiac = new TamGiac(8, 18, 25);
        System.out.println("Chu vi bang: "+ tamGiac.tinhChuVi());
        tamGiac.tinhDienTich();
        
    }
}

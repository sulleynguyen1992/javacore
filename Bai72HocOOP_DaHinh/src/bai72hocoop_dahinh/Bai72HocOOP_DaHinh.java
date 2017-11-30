/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai72hocoop_dahinh;

import kytich.com.model.HinhChuNhat;
import kytich.com.model.HinhVuong;
import kytich.com.model.Shape;

/**
 *
 * @author sulleynguyen
 */
public class Bai72HocOOP_DaHinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape shape;
        shape = new HinhChuNhat(4, 5);
        System.out.println("Chu vi=" +shape.tinhChuvi());
        System.out.println("Dien tich= "+ shape.tinhDienTich());
        
        System.out.println("-----------------------");
        shape = new HinhVuong(5);
        System.out.println("Chu vi= " + shape.tinhChuvi());
        System.out.println("Dien tich= " + shape.tinhDienTich());
    }
    
}

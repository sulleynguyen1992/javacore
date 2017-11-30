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
public class HinhChuNhat extends Shape{

    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieudai, int chieurong) {
        super(chieudai, chieurong);
    }

    
    @Override
    public double tinhChuvi() {
        
        return (this.getChieudai() + this.getChieurong()) * 2;
    }

    @Override
    public double tinhDienTich() {
        return (this.getChieudai() * this.getChieurong());
    }
    
}

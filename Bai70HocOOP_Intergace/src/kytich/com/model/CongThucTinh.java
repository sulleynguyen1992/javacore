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
public class CongThucTinh implements InterfaceCongThuc{

    @Override
    public void cVHinhVuong(float a) {
        System.out.println("chu vi Hinh vuong la: 4 * a = " + 4*a);
    }

    @Override
    public void cVHinhChuNhat(float a, float b) {
        System.out.println("chu vi hinh chu nhat: (a+b)*2 = " +  2*(a + b));
    }

    @Override
    public void sHinhVuong(float a) {
        System.out.println("S Hinh vuong la: a * a = " + a*a);
    }

    @Override
    public void sHinhChuNhat(float a, float b) {
        System.out.println("S Hinh chu nhat la: a * b = " + a*b);
    }
    
}

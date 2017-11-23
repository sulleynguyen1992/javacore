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
public class TamGiac {

    private double canhA;
    private double canhB;
    private double canhC;

    public TamGiac() {
        this.canhA = this.canhB = this.canhC = 1;
    }

    public TamGiac(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    //setter getter 
    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public double getCanhA() {
        return this.canhA;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhB() {
        return this.canhB;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }

    public double getCanhC() {
        return this.canhC;
    }

    //service method type
    public double tinhChuVi() {
        return this.canhA + this.canhB + this.canhC;
    }

    //support method
    private double tinhNuaChuVi() {
        return tinhChuVi() / 2;
    }

    public void tinhDienTich() {

        if (checkTamGiac() == false) {
            System.out.println("tam giac khong hop le");

        } else {
            double p = tinhNuaChuVi();
             
            double dienTich = Math.sqrt(p * (p - this.canhA)
                    * (p - this.canhB) * (p - this.canhC));
            
            System.out.println("Dien tich bang: " + dienTich);

        }
        
    }

    private boolean checkTamGiac() {
        if (this.canhA > 0 && this.canhB > 0 && this.canhC > 0) {
            if ((this.canhA + this.canhB) > this.canhC
                    && (this.canhA + this.canhC) > this.canhB
                    && (this.canhB + this.canhC) > this.canhA) {
                return true;
            }
        }
        return false;
    }
}

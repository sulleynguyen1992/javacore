/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testformatnumber;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sulleynguyen
 */
public class TestFormatNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao diem mon toan");
        double toan = sc.nextDouble();
        System.out.println("nhap vao diem mon ly");
        double ly = sc.nextDouble();
        System.out.println("nhap vao diem mon hoa");
        double hoa = sc.nextDouble();
        
        double diemtrungbinh = (toan+ly+hoa)/3;
        System.out.println("Diem trung binh "+diemtrungbinh);
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Diem trung binh lam tron "+ decimalFormat.format(diemtrungbinh));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapgamedoanso;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sulleynguyen
 */
public class BaiTapGameDoanSo {

    /**
     * @param args the command line arguments
     */
    public static void choi() {
        int diemGoc = 5;
        Random random = new Random();
        int soMay = random.nextInt(6);
        System.out.println("May se in ra tu 1 toi 5, moi ban doan");
        int soNguoiDoan;
        do {
            System.out.println("Ban doan so may: ");
            soNguoiDoan = new Scanner(System.in).nextInt();
            if (soNguoiDoan == soMay) {
                System.out.println("Ban da doan dung, + 1 diem");
                System.out.println("diem cua ban la " + (diemGoc+1));
                diemGoc = diemGoc + 1;
                soMay = random.nextInt(6);
            } else {
                System.out.println("Ban doan khong dung, - 1 diem");
                System.out.println("diem cua ban la " + (diemGoc-1));
                diemGoc = diemGoc - 1;
            }
            if (diemGoc == 10) {
                System.out.println("you win");
                break;
            } else if (diemGoc == 0) {
                System.out.println("You lose");
                break;
            }

        } while (diemGoc <= 10);
    }

    public static void main(String[] args) {
        // TODO code application logic here

        choi();
    }

}

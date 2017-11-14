/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songaunhien;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sulleynguyen
 */
public class SoNgauNhien {

    /**
     * @param args the command line arguments
     */
    public static void choi() {
        Random random = new Random();
        int soMay = random.nextInt(101);
        System.out.println("may se in ra so tu 0 toi 100. Moi ban doan");
        int soNguoiDoan;
        int soLanDoan = 0;
        System.out.println("thim doan lan thu " + (soLanDoan + 1));

        do {
            System.out.println("Ban doan so may:...");
            soNguoiDoan = new Scanner(System.in).nextInt();
            soLanDoan++;
            System.out.println("thim doan so lan thu " + soLanDoan);
            if (soNguoiDoan == soMay) {
                System.out.println("Chuc mung da doan thanh cong");
                break;
            } else if (soNguoiDoan < soMay) {
                System.out.println("so ban doan sai. so may > so doan");
            } else {
                System.out.println("so ban doan sai. so may < so doan");
            }
            if (soLanDoan == 7) {
                System.out.println("Ban da thua, so may la: " + soMay);
                break;
            }

        } while (soLanDoan <= 7);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            choi();
            System.out.println("choi nua khong c/k");
            String traloi = new Scanner(System.in).nextLine();
            if (traloi.equalsIgnoreCase("k")) {
                break;
            }

        }
        System.out.println("tam biet ban");
    }

}

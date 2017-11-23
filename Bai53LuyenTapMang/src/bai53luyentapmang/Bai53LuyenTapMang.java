/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai53luyentapmang;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sulleynguyen
 */
public class Bai53LuyenTapMang {

    /**
     * @param args the command line arguments
     */
    static int[] M;

    public static void menu() {
        System.out.println("1. Nhap mang");
        System.out.println("2. Xuat mang");
        System.out.println("3. Tinh tong mang");
        System.out.println("4. Tim kiem");
        System.out.println("5. Lon nhat");
        System.out.println("6. Nho nhat ");
        System.out.println("7. So nguyen to");
        System.out.println("8. Sap xep tang");
        System.out.println("9. Sap xem giam");
        System.out.println("0. thoat chuong trinh");
        System.out.println("Ban su dung chuc nang nao?    ");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                nhapmang();
                break;
            case 2:
                xuatmang();
                break;
            case 3:
                tinhTong();
                break;
            case 4:
                timkiem();
                break;
            case 5:
                timMax();
                break;
            case 6:
                timMin();
                break;
            case 7:
                soNguyenTo();
                break;
            case 8:
                sapXepTang();
                break;
            case 9:
                sapXepGiam();
                break;
            case 0:
                System.err.print("Cam on ban da su dung chong trinh");
                System.exit(0);
                break;
            default:
                System.out.println("nhap sai roi");

        }
    }

    private static void nhapmang() {
        System.out.println("Moi ban nhap so phan tu: ");
        int n = new Scanner(System.in).nextInt();
        M = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            M[i] = random.nextInt(100);
        }
    }

    private static void xuatmang() {
        System.out.println("Cac phan tu trong mang la: ");
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + "\t");

        }
        System.out.println("");
    }

    private static void tinhTong() {
        int sum = 0;
        for (int x : M) {
            sum += x;
        }
        System.out.println("tong cua mang la: " + sum);
    }

    private static void timkiem() {
        int solan = 0;
        String s = "";
        System.out.println("Thim muon tim so gi");
        int k = new Scanner(System.in).nextInt();
        for (int i = 0; i < M.length; i++) {
            if (M[i] == k) {
                solan++;
                s += i + ";";
            }
        }
        if (solan == 0) {
            System.out.println("Khong co " + k + " trong mang");
        } else {
            System.out.println("Thay " + k + " trong mang");
            System.out.println("Cac vi tri tim thay");
            System.out.println(s);
        }
    }

    private static void timMin() {
        int min = M[0];
        for (int i = 0; i < M.length; i++) {
            if (M[i] < min) {
                min = M[i];
            }
        }
        System.out.println("So nho nhat la " + min);
    }

    private static void timMax() {
        int max = M[0];
        for (int i = 0; i < M.length; i++) {
            if (M[i] > max) {
                max = M[i];
            }
        }
        System.out.println("So lon nhat la " + max);
    }

    private static void soNguyenTo() {
        //la so chia het cho 1 va chinh no
        System.out.println("Cac so nguyen to");
        for (int i = 0; i < M.length; i++) {
            int dem = 0;
            for (int j = 1; j <= M[i]; j++) {
                if (M[i] % j == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.print(M[i] + "\t ");
            }
        }
        System.out.println("");
    }

    private static void sapXepTang() {
        for (int i = 0; i < M.length; i++) {
            for (int j = i + 1; j < M.length; j++) {
                if (M[i] > M[j]) {
                    int temp = M[i];
                    M[i] = M[j];
                    M[j] = temp;

                }
            }
        }
    }

    private static void sapXepGiam() {
        for (int i = 0; i < M.length; i++) {
            for (int j = i + 1; j < M.length; j++) {
                if (M[i] < M[j]) {
                    int temp = M[i];
                    M[i] = M[j];
                    M[j] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            menu();
            System.out.println("");
        }
    }

}

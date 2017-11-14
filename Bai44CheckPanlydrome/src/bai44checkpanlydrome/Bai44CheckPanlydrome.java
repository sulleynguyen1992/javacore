/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai44checkpanlydrome;

import java.util.Scanner;

/**
 *
 * @author sulleynguyen
 */
public class Bai44CheckPanlydrome {

    /**
     * @param args the command line arguments
     */
    public static boolean checkPanlydrome(String chuoi) {

        char[] arr = chuoi.toCharArray();
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            //Chung minh phan chung
            if (arr[i] != arr[arr.length - 1 - i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao mot chuoi: ");
            String s = scanner.nextLine();
            boolean value = checkPanlydrome(s);
            if (value == true) {
                System.out.println("chuoi " + s + " la panlydrome");
            } else {
                System.out.println("chuoi " + s + " khong phai panlydrome");
            }
            System.out.println("choi nua khong c/k");
            String traloi = new Scanner(System.in).nextLine();
            if (traloi.equalsIgnoreCase("k")) {
                break;
            }
        }
        System.out.println("xin tam biet");
    }
}

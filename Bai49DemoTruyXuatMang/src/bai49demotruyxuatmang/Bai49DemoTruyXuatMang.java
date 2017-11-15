/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai49demotruyxuatmang;

import java.util.Scanner;

/**
 *
 * @author sulleynguyen
 */
public class Bai49DemoTruyXuatMang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] M;
        System.out.println("enter the max of array: ");
        int n = sc.nextInt();
        //cap phat n phan tu cho mang m
        M = new int[n];
        //tien hanh nhap du lieu cho tung phan tu trong mang
        System.out.println("enter the value of array: ");
        for (int i = 0; i < M.length; i++) {
            System.out.print("M["+i+"]=");
            M[i]=sc.nextInt();
        }
        //print the array
        System.out.println("array after enter the value: ");
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + "\t");
        }
        System.out.println("");
        //xuat mang theo gia tri
        for(int i: M){
            System.out.print(i + "\t");
        }
    }
    
}

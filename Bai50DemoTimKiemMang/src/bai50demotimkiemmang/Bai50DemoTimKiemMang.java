/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai50demotimkiemmang;

import java.util.Scanner;

/**
 *
 * @author sulleynguyen
 */
public class Bai50DemoTimKiemMang {

    /**
     * @param args the command line arguments
     */
    public static void enterArray(int[] M) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < M.length; i++) {
            System.out.print("M[" + i + "]=");
            M[i] = sc.nextInt();

        }
    }

    public static void exportArray(int[] M) {
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + "\t");
        }
        System.out.println("");
    }

    public static void findValue(int[] M, int k) {
        boolean findValue = false;
        for (int i = 0; i < M.length; i++) {
            if (M[i] == k) {
                findValue = true;
                break;
            }
        }
        if (findValue == true) {
            System.out.println("Find " + k + " in array");
        } else {
            System.out.println("Can't find " + k + " in array");
        }
    }
    public static void countNumbersOfValue(int[] M, int k){
        String s ="";
        int number=0;
        for (int i = 0; i < M.length; i++) {
            if(M[i] == k){
               s+= i+";";
               number++;
            }
        }
        if (s.length() > 0) {
            System.out.println("Find "+k+" number of show "+number+"");
            System.out.print("position in array: ");
            System.out.print(s);
        }else{
            System.out.println("can't find "+k+" in array");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capability of array: ");
        int n = sc.nextInt();
        int[] M = new int[n];
        System.out.println("Enter array value: ");
        enterArray(M);
        System.out.println("Export array ");
        exportArray(M);
        System.out.println("Find value");
        System.out.println("Enter the value need find");
        int k = sc.nextInt();
        findValue(M, k);
        System.out.println("Enter the value need find");
        int l = sc.nextInt();
        countNumbersOfValue(M, l);
    }

}

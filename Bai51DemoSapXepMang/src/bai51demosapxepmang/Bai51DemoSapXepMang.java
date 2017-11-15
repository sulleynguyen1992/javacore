/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai51demosapxepmang;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sulleynguyen
 */
public class Bai51DemoSapXepMang {

    /**
     * @param args the command line arguments
     */
    public static void inputArray(int[] arr){
        Random random = new Random();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
    }
    public static void exportArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void bubbleSort(int[] M){
        int i,j;
        for(i = 0; i < M.length; i++){
            for (j = M.length - 1; j > i; j--) {
                if(M[j] < M[j-1]){
                    int temp = M[j];
                    M[j] = M[j - 1];
                    M[j - 1] = temp;
                }
            }
        }
        for (int k = 0; k < M.length; k++) {
            System.out.print(M[k] + "\t");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Array: ");
        int n = sc.nextInt();
        
        int[] M = new int[n];
        inputArray(M);
        System.out.println("The random array after input number of Array: ");
        exportArray(M);
        System.out.println("after use bubble sort algothrim");
        bubbleSort(M);
    }
    
}

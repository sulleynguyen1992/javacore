/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

/**
 *
 * @author sulleynguyen
 */
public class Bai64HocOOP_ParameterList {

    /**
     * @param arr
     * @param args the command line arguments
     */
    public static int sum(int ...arr){
        int s = 0;
        int s1 = 0;
        for (int i = 0; i < arr.length; i++) {
            s +=arr[i];
        }
        for(int a : arr){
            s1 += a;
        }
        return s1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int s = sum(2,4,5,6,7);
        System.out.println("sum = " + s);
    }
    
}

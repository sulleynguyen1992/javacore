/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai41demotachchuoisplit;

/**
 *
 * @author sulleynguyen
 */
public class Bai41DemoTachChuoiSplit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "GT00291;Nguyen Trac Thang;The university of Greenwich";
        String[] arr = s.split(";");
        if (arr.length == 3) {
            System.out.println("Code: " + arr[0]);
            System.out.println("Name: " + arr[1]);
            System.out.println("School: " + arr[2]);
        }
        System.out.println("---------Use for method-----------");
        for (int i = 0; i < arr.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Code: " + arr[i]);
                    break;
                case 1:
                    System.out.println("Name: " + arr[i]);
                    break;
                case 2:
                    System.out.println("School: " + arr[i]);
                    break;

            }
        }
        System.out.println("-----------Use For Each method");
        for (String information : arr) {
            System.out.println(information);
        }
    }

}

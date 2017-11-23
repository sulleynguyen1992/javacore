/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai58renluyenarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sulleynguyen
 */
public class Bai58RenLuyenArrayList {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Integer> arrData = new ArrayList<Integer>();
    
    public static void menu() {
        System.out.println("1. Add");
        System.out.println("2. Export");
        System.out.println("3. Edit");
        System.out.println("4. Delete");
        System.out.println("5. Search");
        System.out.println("6. Sort");
        System.out.println("7. Exit");
        System.out.println("Choose function you need: ");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                export();
                break;
            case 3:
                edit();
                break;
            case 4:
                delete();
                break;
            case 5: 
                search();
                break;
            case 6:
                sort();
                break;
            case 7: 
                exitApp();
                break;
            default:
                System.out.println("Wrong way?");
                break;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {            
            menu();
        }

    }

    private static void add() {
        System.out.println("Enter the add value: ");
        int value = new Scanner(System.in).nextInt();
        arrData.add(value);
        
    }

    private static void export() {
        for (int i = 0; i < arrData.size(); i++) {
            System.out.print(arrData.get(i) + "\t");
        }
        System.out.println("");
    }

    private static void edit() {
        System.out.println("Enter edit index: ");
        int pos = new Scanner(System.in).nextInt();
        System.out.println("New value");
        int newValue = new Scanner(System.in).nextInt();
        arrData.set(pos, newValue);
    }

    private static void delete() {
        System.out.println("Enter delete index");
        int pos = new Scanner(System.in).nextInt();
        arrData.remove(pos);
    }

    private static void search() {
        int count = 0;
        String s = "";
        System.out.println("What number your need: ");
        int k = new Scanner(System.in).nextInt();
        for (int i = 0; i < arrData.size(); i++) {
            if(arrData.get(i) == k){
                count++;
                s += i + "\t";
            }
        }
        if(count == 0){
            System.out.println("No "+k+"in array your search");
        }else{
            System.out.println("Have "+count+" result in array your search. ");
            System.out.print("in position: " + s);
            System.out.println();
        }
        //su dung ham contain
        if(arrData.contains(k)){
            System.out.println("Have "+k+" in array your search");
        }
        
    }

    private static void sort() {
        Collections.sort(arrData);
        System.out.println("ArrayList after Sort");
        for (int i = 0; i < arrData.size(); i++) {
            System.out.print(arrData.get(i) + "\t");
        }
        System.out.println("");
    }

    private static void exitApp() {
         System.err.println("Thanks for use application");
         System.exit(0);
         
    }

}

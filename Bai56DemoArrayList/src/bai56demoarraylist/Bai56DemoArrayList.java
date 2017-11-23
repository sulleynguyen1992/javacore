/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai56demoarraylist;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sulleynguyen
 */
public class Bai56DemoArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("Sulley");
        arrayList.add("Nguyen");
        arrayList.add(1, "King");
        
        for(String s : arrayList){
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("For dang binh thuong");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        
        ArrayList arr2 = new ArrayList();
        arr2.add("1");
        arr2.add(new Date("12/12/1990"));
        arr2.add("5.5");
        
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        ArrayList<Double> arr4 = new ArrayList<Double>();
        ArrayList<Boolean> arr5 = new ArrayList<Boolean>();
        
    }
    
}

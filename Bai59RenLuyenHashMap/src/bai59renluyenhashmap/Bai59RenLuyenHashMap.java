/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai59renluyenhashmap;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author sulleynguyen
 */
public class Bai59RenLuyenHashMap {
    static HashMap<Integer, String> map = new HashMap<>();
    /**
     * @param args the command line arguments
     */
    public static void menu(){
        System.out.println("1. Add");
        System.out.println("2. Export");
        System.out.println("3. Edit");
        System.out.println("4. Delete");
        System.out.println("5. Search");
        System.out.println("6. Exit");
        System.out.println("What you choice?");
        int choice = new Scanner(System.in).nextInt();
        switch(choice){
            case 1:
                addValue();
                break;
            case 2:
                export();
                break;
            case 3:
                editValue();
                break;
            case 4:
                deleteValue();
                break;
            case 5:
                search();
                break;
            case 6:
                System.err.println("Thank for use");
                System.exit(0);
                break;
            default:
                System.out.println("Try again");
                    
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {            
            menu();
        }
    }

    private static void addValue() {
        System.out.println("Enter the key: ");
        int key = new Scanner(System.in).nextInt();
        System.out.println("Enter the value: ");
        String bookName = new Scanner(System.in).nextLine();
        
        if(map.containsKey(key)==false){
            map.put(key, bookName);
        }else
            System.out.println("Key exist");
        
    }

    private static void editValue() {
        System.out.println("Enter the key edit: ");
        int key = new Scanner(System.in).nextInt();
        if(map.containsKey(key)==false){
            System.out.println("Key " +key + " not exist");
        }else{
            System.out.println("Enter the new book name: ");
            String bookName = new Scanner(System.in).nextLine();
            map.put(key, bookName);
        }
    }   

    private static void export() {
        System.out.println("Key\tBook Name");
        for (Map.Entry<Integer,String> item : map.entrySet()) {
            System.out.println(item.getKey()+"\t"+item.getValue());
        }
    }

    private static void deleteValue() {
        System.out.println("Enter the key delete: ");
        int key = new Scanner(System.in).nextInt();
        if(map.containsKey(key)==false){
            System.out.println("Key " +key + " not exist");
        }else{
            map.remove(key);
        }
    }

    private static void search() {
        System.out.println("Enter the book name: ");
        String bookName = new Scanner(System.in).nextLine();
        for(Map.Entry<Integer,String> item : map.entrySet()){
            if(item.getValue().contains(bookName)){
                System.out.println(item.getKey() + "-" + item.getValue());
            }
        }
    }
    
}

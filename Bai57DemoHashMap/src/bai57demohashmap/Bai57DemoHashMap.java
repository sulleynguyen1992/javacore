/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai57demohashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author sulleynguyen
 */
public class Bai57DemoHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(1, "An");
        map.put(2, "Binh");
        map.put(3, "Hanh");
        map.put(4, "Phuc");
        map.put(5, "Giai");
        map.put(6, "Thoat");
        
        map.put(5, "Happy");
        map.remove(2);
        //lay toan bo ten ra
        Collection<String> dsTen = map.values();
        for(String ten : dsTen){
            System.out.print(ten + " "); 
            
        }
        System.out.println("");
        Set<Integer> dsMa = map.keySet();
        for (int ma : dsMa) {
            System.out.print(ma + " ");
        }
        System.out.println("");
        String ten = map.get(4);
        System.out.println(ten);
        
        
        
        
                
    }
    
}

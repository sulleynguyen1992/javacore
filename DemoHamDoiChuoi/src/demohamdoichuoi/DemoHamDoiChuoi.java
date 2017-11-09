/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohamdoichuoi;

/**
 *
 * @author sulleynguyen
 */
public class DemoHamDoiChuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "Xin chao Thang, toi la Thang Sulley";
        s.replace("Thang", "Sulley");
        System.out.println(s);
        s = s.replace("Thang", "Sulley");
        System.out.println();
        
        s= s.replaceFirst("Thang", "Kindre");
        System.out.println();
    }
    
}

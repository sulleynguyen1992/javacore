/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai42demodoichuhoathuong;

/**
 *
 * @author sulleynguyen
 */
public class Bai42DemoDoiChuHoaThuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "sulleynguyen";
        
        s1 = s1.replaceFirst((s1.charAt(0) + ""), 
                (s1.charAt(0)+"").toUpperCase());
        System.out.println(s1);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demososanhchuoi;

/**
 *
 * @author sulleynguyen
 */
public class DemoSoSanhChuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "thang";
        String s2 = "THANG";
        int kq = s1.compareTo(s2);
        System.out.println(kq);

        int kq2 = s1.compareToIgnoreCase(s2);
        System.out.println(kq2);

        if (s1.equals(s2)) {
            System.out.println("s1 = s2");
        } else {
            System.out.println("s1 != s2");
        }
        
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("s1 = s2");
        }else{
            System.out.println("s1 != s2");
        }
        
    }

}

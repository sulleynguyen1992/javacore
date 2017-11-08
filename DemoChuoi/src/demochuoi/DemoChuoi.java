/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demochuoi;

/**
 *
 * @author sulleynguyen
 */
public class DemoChuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 =  new String();
        String s2 = new String("Obama");
        String s3 = "Obama";
        System.out.println("chieu dai s1: " + s1.length());
        System.out.println("chieu dai s2: " + s2.length());
        System.out.println("Chieu dai s3: " + s3.length());
        
        if(s2 == s3){
            System.out.println("S2 va S3 giong nhau");
        }
        else{
            System.out.println("S2 va S3 khong giong nhau");
        }
        if(s2.equals(s3)){
            System.out.println("S2 co do dai bang S3");
        }
    }
    
}

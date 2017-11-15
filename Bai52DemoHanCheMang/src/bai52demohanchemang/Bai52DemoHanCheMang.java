/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai52demohanchemang;

/**
 *
 * @author sulleynguyen
 */
public class Bai52DemoHanCheMang {

    /**
     * @param args the command line arguments
     */
    public static int[] xoaMang(int[] M, int posDelete){
        int i;
        int[] M2 = new int[M.length - 1];
   
        for (i=0; i < M2.length; i++) {
            if(i == posDelete){
                M2[i] = M[i + 1];
                
            }
            else if(i > posDelete){
                M2[i] = M[i + 1];
            }
            else
                M2[i] = M[i];
        }
        return M2;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] M = {2,4,5,1,3};
        int[] M2 = xoaMang(M, 4);
        for (int i = 0; i < M2.length; i++) {
            System.out.print(M2[i] + "\t");
        }
        
    }
    
}

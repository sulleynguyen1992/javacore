/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwsDemo;

/**
 *
 * @author sulleynguyen
 */
public class ThrowTest {
    
    public static void ptBac1(int a, int b)throws Exception{
        try {
            System.out.println("x"+(-b/a));
        } catch (Exception e) {
            throw e;
        }
        
    }

    public static void main(String[] args) {
        try {
            ptBac1(0, 5);
        } catch (Exception ex) {
            System.out.println("co loi xay ra");
        }
    }

}

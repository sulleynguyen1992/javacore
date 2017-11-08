/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchdemo;

/**
 *
 * @author sulleynguyen
 */
public class TryCatchDemo {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        try {
            int x = 10;
            System.out.println("x=" + x);
            int y = 5 / 10;
            System.out.println("y=" + y);

            int z = x / y;
            System.out.println("z=" + z);
        } 
        catch(ArithmeticException arithmeticException){
            System.out.println("co loi toan hoc");
            arithmeticException.printStackTrace();
        }
        catch (Exception ex) {
            System.out.println("co loi xay ra");
            ex.printStackTrace();

        }
        finally{
            System.out.println("cam on da su dung chuong trinh");
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostringbuilder;

/**
 *
 * @author sulleynguyen
 */
public class DemoStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder builder = new StringBuilder();
        builder.append("hello you");
        builder.append(" ");
        builder.append("go to school");
        builder.append(" ");
        builder.append("now");
        builder.insert(22, " FPT");
        builder.delete(5, 9);
        System.out.println("doan chuoi la: " + builder);
        System.out.println("do dai chuoi la: " + builder.length());
        
    }
    
}

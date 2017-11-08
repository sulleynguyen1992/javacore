/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostringbuilder;

import java.util.StringTokenizer;

/**
 *
 * @author sulleynguyen
 */
public class TestStringTokenizer {

    public static void main(String[] args) {
        String s1 = "xin chao the gioi internet";

        StringTokenizer tokenizer = new StringTokenizer(s1);
        while (tokenizer.hasMoreTokens()) {
            String stringToken1 = tokenizer.nextToken();
            System.out.print("-" + stringToken1);
        }
        System.out.println("\n");
        System.out.println("-------------------");
        
        String s2 = "Em;Chao;Anh;Thang!Dai;ca";
        
        StringTokenizer tokenizer1 = new StringTokenizer(s2,";!");
        while (tokenizer1.hasMoreTokens()) {
            String stringToken2 = tokenizer1.nextToken();
            System.out.println(stringToken2);
        }
    }
}

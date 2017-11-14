/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai45chuoitoiuu;

/**
 *
 * @author sulleynguyen
 */
public class Bai45ChuoiToiUU {

    /**
     * @param args the command line arguments
     */
    public static String toiUuChuoi(String s){
        String stringToiUu = s;
        stringToiUu.trim();
        String[] arrWord =  stringToiUu.split(" ");
        stringToiUu = "";
        for(String word : arrWord){
            String newWord = word.toLowerCase();
            if(newWord.length() > 0){
                newWord = newWord.replaceFirst((newWord.charAt(0)+""), (newWord.charAt(0)+"").toUpperCase());
                stringToiUu+= newWord + " ";
            }
        }       
        return stringToiUu.trim();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String s = toiUuChuoi("     Nguyen    Trac   Thang");
        System.out.println(s);
    }
    
}

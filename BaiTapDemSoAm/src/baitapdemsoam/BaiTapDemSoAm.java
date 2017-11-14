/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapdemsoam;

/**
 *
 * @author sulleynguyen
 */
public class BaiTapDemSoAm {

    /**
     * @param args the command line arguments
     */
    public static void negativeNumberInString(String s){
        String newStr = s;
        String negativeStr= "";
        String[] arr = s.split("");
        int posNegativeSign;
        posNegativeSign = s.indexOf("-");
        for (int i = posNegativeSign + 1; i < newStr.length(); i++) {
                char a_char =  newStr.charAt(i);
                if(Character.isDigit(a_char)){
                    negativeStr += "-" + a_char;
                }
                else{
                   newStr =  newStr.substring(i);
                    break;
                }
        }
        System.out.println("negative Str: " + negativeStr);
        System.out.println("new string: " + newStr);
        System.out.println("pos: " + posNegativeSign);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        negativeNumberInString("abc-5xyz-12k9pk");
    }
    
}

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
    public static void negativeNumberInString(String s) {
        String newStr = s;
        String negativeStr = "";
        String[] arr = s.split("");
        int posNegativeSign;
        posNegativeSign = s.indexOf("-");
        for (int i = posNegativeSign + 1; i < newStr.length(); i++) {
            char a_char = newStr.charAt(i);
            if (Character.isDigit(a_char)) {
                negativeStr += "-" + a_char;
            } else {
                newStr = newStr.substring(i);
                break;
            }
        }
        System.out.println("negative Str: " + negativeStr);
        System.out.println("new string: " + newStr);
        System.out.println("pos: " + posNegativeSign);
    }

    public static void negativeNumberCheck(String s) {
        String newStr = s;
        //mang de tach chuoi
        String[] arr = s.split("");
        String negativeStr = "";
        String newStrWithAllNegativeNumber = "";
        int breakPos = 0;
        for (int i = 0; i < newStr.length(); i++) {

            //tim den sign negative
            if (arr[i].equalsIgnoreCase("-")) {
                //tinh tu sign negative dau tien hoac sign tiep theo
                if (breakPos == 0 || i > breakPos) {
                    for (int j = i + 1; j < newStr.length(); j++) {
                        //tao char tai vi tri j
                        char a_char = newStr.charAt(j);
                        if (Character.isDigit(a_char)) {
                            negativeStr += a_char;
                            breakPos = j;
                        } else {
                            break;
                        }

                    }
                    if (!negativeStr.equals("")) {
                        newStrWithAllNegativeNumber += "-" + negativeStr + ",";
                        negativeStr = "";
                    }
                }

            }

        }
        System.out.println("negative Str: " + newStrWithAllNegativeNumber);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        negativeNumberCheck("---c-12-13-kc----12----");
    }

}

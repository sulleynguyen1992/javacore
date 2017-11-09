/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoxoakhoangtrang;

/**
 *
 * @author sulleynguyen
 */
public class DemoXoaKhoangTrang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "    Nguyen Trac Thang    ";
        System.out.println(s);
        System.out.println("chieu dai cua s: " + s.length());
        s = s.trim();
        System.out.println("Chieu dai cua s: " + s.length());

        String s2 = "    Thang an com voi Anh    ";

        int posLeft = 0;
        int i = 0;
        for (i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (c == ' ') {
                posLeft = i;
            } else {
                break;
            }
        }
        s2 = s2.substring(i);
        System.out.println(s2);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timkiemchuoi;

import java.util.StringTokenizer;
import sun.util.locale.StringTokenIterator;

/**
 *
 * @author sulleynguyen
 */
public class TimKiemChuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "anh Công tằng tôn nữ, nguyễn thị long lanh chòng chành ánh tuyết anh";
        int vt1 = s.indexOf("ô");
        System.out.println("tìm thấy [ô] ở vị trí thứ: " + vt1);
        int vt2 = s.indexOf("anh");
        System.out.println("Tìm thấy [anh] ở vị trí thứ: " + vt2);
        int vt3 = s.indexOf("hùng");
        if (vt3 == -1) {
            System.out.println("Không tìm thấy 'Hùng'");
        }else{
            System.out.println("Tìm thấy [hùng] vị trí thứ; " + vt3);
        }
        
        int vt4 = s.lastIndexOf("ô");
        System.out.println("Tìm thấy [ô] ở vị trí cuối cùng thứ: " + vt4);
        
        if(s.contains("ánh") == true){
            System.out.println("Có [Ánh] trong chuỗi");
        }else{
            System.out.println("ko có ");
        }
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        int dem = 0;
        while(stringTokenizer.hasMoreTokens()){
            String value = stringTokenizer.nextToken();
            if(value.contains("anh")){
                 dem++;
            } 
        }
        System.out.println("Tim thay "+dem+" lan tu [anh]");
        
    }
    
}

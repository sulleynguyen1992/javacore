/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demongaythangnam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author sulleynguyen
 */
public class DemoNgayThangNam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //lay ngay gio hien tai he thong
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("year: " + year);
        int month = calendar.get(Calendar.MONTH);
        System.out.println("month: " + (month + 1));
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Day: " + day);
        
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(date));
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf1.format(date));
        
        //hh:mm:ss aaa de cho biet AM/PM cua dinh dang 12gio
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
        System.out.println(sdf2.format(date));
    }
    
}

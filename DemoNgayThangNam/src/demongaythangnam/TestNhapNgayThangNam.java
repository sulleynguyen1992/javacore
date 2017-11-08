/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demongaythangnam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author sulleynguyen
 */
public class TestNhapNgayThangNam {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int  yearNow = calendar.get(Calendar.YEAR);
        
        System.out.println("Moi thim nhap ngay thang nam sinh voi dinh dang dd/MM/yyyy");
        String yearBorn = new Scanner(System.in).nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date birthDay = dateFormat.parse(yearBorn);
            //doi ngay thang nam
            calendar.setTime(birthDay);
            int getYearBorn = calendar.get(Calendar.YEAR);
            
            int age =  yearNow - getYearBorn;
            System.out.println("Tuoi cua ban: " + age);
        } catch (ParseException ex) {
            System.out.println("Ban nhap sai ngay thang nam sinh cua ban");
        }

    }
}

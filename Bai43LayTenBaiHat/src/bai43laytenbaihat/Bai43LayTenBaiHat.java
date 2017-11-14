/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai43laytenbaihat;

/**
 *
 * @author sulleynguyen
 */
public class Bai43LayTenBaiHat {

    /**
     * @param args the command line arguments
     */
    public static String getTenBaiHatMP3(String baihat){
        int posLast = baihat.lastIndexOf("/");
        String tenBaiHat = baihat.substring(posLast + 1);
        return tenBaiHat;
    }
    public static String getTenBaiHatKhongMP3(String baihat){
        int posLast1 = baihat.lastIndexOf("/");
        int posLast2 = baihat.lastIndexOf(".");
        String tenBaiHat = baihat.substring(posLast1 + 1,posLast2);
        return tenBaiHat;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String baihat = "D:/mucsic/nhacvietnam/nhacvang/longme.mp3";
        String tenbaihat = getTenBaiHatMP3(baihat);
        System.out.println("ten bai hat: " + tenbaihat);
        System.out.println("-------------------------");
        String tenBaiHat2 = getTenBaiHatKhongMP3(baihat);
        System.out.println("ten bai hat 2: " + tenBaiHat2);
    }
    
}

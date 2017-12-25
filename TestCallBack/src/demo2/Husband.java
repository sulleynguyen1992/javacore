/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

/**
 *
 * @author nguye
 */
public class Husband {
    public void regesterEnterHotelEvent(ThamTu thamTu){
        thamTu.phoneToHusband();
    }
    public static void main(String[] args) {
        Husband husband = new Husband();
        ThamTu conan = new ThamTuCoNan();
        husband.regesterEnterHotelEvent(conan);
    }
}

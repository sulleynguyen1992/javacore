/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sulleynguyen
 */
public class NhanVien implements Cloneable{
    private int code;
    private String name;
    
    public NhanVien(int code, String name){
        this.code = code;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setCode(int code){
        this.code = code;
    }
    public int getCode(){
        return code;
    }
    public NhanVien copy(){
        try {
            return (NhanVien) this.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

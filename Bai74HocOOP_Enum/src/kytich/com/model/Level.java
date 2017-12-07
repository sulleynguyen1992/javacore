/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.model;

/**
 *
 * @author sulleynguyen
 */
public enum Level {
    Exellent ("Xuất Sắc"),
    Good ("Giỏi"),
    Average ("Trung bình"),
    Bad ("Yếu");
    
    private String msg;

    private Level(String msg) {
        this.msg = msg;
    }
    public String description(){
        return this.msg;
    }
}

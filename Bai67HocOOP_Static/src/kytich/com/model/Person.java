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
public class Person {
    private static int codeCountry;
    
    public void setCodeCountry(int codeCountry){
        this.codeCountry =  codeCountry;
    }
    
    public int getCodeCountry(){
        return this.codeCountry;
    }
}

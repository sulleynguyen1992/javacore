/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import kytich.com.model.Person;

/**
 *
 * @author sulleynguyen
 */
public class TestPerson {
    public static void main(String[] args) {
        Person ps = new Person();
        ps.setCodeCountry(12);
        
        Person person = new Person();
        System.out.println(person.getCodeCountry());
        
        Person person1 = new Person();
        person1.setCodeCountry(24);
        
        System.out.println("Person: " + person.getCodeCountry());
    }
    
}

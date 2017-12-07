/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.test;

import java.util.ArrayList;
import kytich.com.model.BloodGroup;
import kytich.com.model.Man;
import kytich.com.model.Person;
import kytich.com.model.Woman;

/**
 *
 * @author sulleynguyen
 */
public class TestPerson {

    public static void main(String[] args) {
        BloodGroup tipA = new BloodGroup();
        tipA.setBloodName("A");
        ArrayList<Person> listPerson = new ArrayList<>();
        Person an = new Man();
        an.setFirstName("An");
        an.setBlood(tipA);
        Person hong = new Woman();
        hong.setFirstName("Hong");
        ((Woman) hong).setWearingMakeup(true);

        listPerson.add(an);
        listPerson.add(hong);

        for (Person p : listPerson) {
            if (p instanceof Man) {
                System.out.println(p.getFirstName() + " is Man " + "Tip Blood  " + p.getBlood());
            } else if (p instanceof Woman) {
                System.out.println(p.getFirstName() + " is woman");
            }
        }

    }
}

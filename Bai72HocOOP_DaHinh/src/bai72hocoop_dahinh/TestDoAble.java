/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai72hocoop_dahinh;

import kytich.com.model.Employee;
import kytich.com.model.IDoAble;
import kytich.com.model.Student;

/**
 *
 * @author sulleynguyen
 */
public class TestDoAble {
    public static void main(String[] args) {
        IDoAble able;
        able = new Employee();
        able.doSomeThing();
        
        able = new Student();
        able.doSomeThing();
        
    }
}

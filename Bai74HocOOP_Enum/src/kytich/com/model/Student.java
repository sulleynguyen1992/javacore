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
public class Student {
    private int code;
    private String name;
    private double avgPoint;
    private Level level;

    public Student() {
    }

    public Student(int code, String name, double avgPoint) {
        this.code = code;
        this.name = name;
        this.avgPoint = avgPoint;
        this.level = getLevel();
        
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public Level getLevel() {
        if(this.avgPoint >= 8){
            level = Level.Exellent;
        }else if(this.avgPoint >= 6.5){
            level = Level.Good;
        }else if(this.avgPoint >= 5){
            level = Level.Average;
        }else
            level = Level.Bad;
        return level;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return this.code 
                + "\t" + this.name + "\t" 
                + this.avgPoint + "\t=>" 
                + this.getLevel().description();
    }
    
    
}

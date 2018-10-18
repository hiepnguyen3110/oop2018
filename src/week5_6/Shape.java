/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author CCNE
 */
public abstract class Shape {
    protected String color;
    private String name;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
    
}

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
public class Circle extends Shape{
    private final String name = "Circle";
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    Circle() {
    }
    
}

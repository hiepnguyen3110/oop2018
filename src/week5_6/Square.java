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
public class Square extends Rectangle {
    private final String name = "Square";

    public Square(double width, String color) {
        super(width, width, color);
    }

    Square() {
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return width;
    }

    public void setSize(double size) {
        this.width = size;
        this.hight = size;
    }
    
}

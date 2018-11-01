/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7_task1;

/**
 *
 * @author admin
 */
public class Numeral extends Expression{
    
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public Numeral(int value) {
        this.value = value;
    }
    
    
    @Override
    public String toString() {
        return null;
        
    }

    @Override
    public int evaluate() {
        return value;
        
    }
    
}

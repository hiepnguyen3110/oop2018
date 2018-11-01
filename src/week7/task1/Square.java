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
public class Square extends Expression{

    private Expression expression;
    
    public Square(Expression expression) {
        this.expression = expression;
    }
    
    public String toString(){
        return expression.evaluate() + "^2";
    }
    
    public int evaluate(){
        return expression.evaluate() * expression.evaluate();
    }
}

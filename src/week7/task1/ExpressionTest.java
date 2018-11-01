/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task1;

/**
 *
 * @author admin
 */
public class ExpressionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numeral num1 = new Numeral(10);
        Numeral num2 = new Numeral(1);
        Numeral num3 = new Numeral(2);
        Numeral num4 = new Numeral(3);
        
        Square sq = new Square(num1);
        Subtraction sub = new Subtraction(sq, num2);
        Multiplication mul = new Multiplication(num3, num4);
        Addition add = new Addition(sub, mul);
        Square sq2 = new Square(add);
        
        System.out.println("(" + num1.evaluate() + "^2 - " + num2.evaluate() + " + "
                + num3.evaluate() + "*" + num4.evaluate() + ")^2 = " + sq2.evaluate());
        
        Numeral num5 = new Numeral(0);
        try{ 
            Division div = new Division(num1, num5);
            System.out.println(div.evaluate());
        }
        catch(ArithmeticException exception) {
            System.out.println(exception);
        }
    }
    
    
}

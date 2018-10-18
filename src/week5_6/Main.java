/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Diagram diagram = new Diagram();
        Layer lay1 = new Layer();
        Layer lay2 = new Layer();
        
        Shape shape = new Shape() {};
        lay1.addShape(new Circle());
        lay1.addShape(new Rectangle());
        lay1.addShape(new Square());
        lay1.addShape(new Triangle());
        lay1.addShape(new Triangle());
        
        lay2.addShape(new Circle());
        lay2.addShape(new Rectangle());
        lay2.addShape(new Square());
        lay2.addShape(new Circle());
        lay2.addShape(new Triangle());
        
        diagram.addLayer(lay1);
        diagram.addLayer(lay2);
        
        System.out.println("lay1: ");
        lay1.PrintShape();
        System.out.println("\nlay2: ");
        lay2.PrintShape();
        
        lay1.DeleteTriangle();//chỉ xóa ở lay1
        System.out.println("\nDelete triangle");
        System.out.println("lay1: ");
        lay1.PrintShape();
        System.out.println("\nlay2: ");
        lay2.PrintShape();
        
        System.out.println("\nDelete circle: ");
        diagram.DeleteCircle();//xóa ở cả 2 layer
        System.out.println("lay1: ");
        lay1.PrintShape();
        System.out.println("\nlay2: ");
        lay2.PrintShape();
    }
    
    
}

package week11;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    
    public static <T extends Comparable<T>> T max(ArrayList<T> a){
        T max = a.get(0);
        for(int i = 1; i < a.size(); i++){
            if(max.compareTo(a.get(i)) < 0){
                max = a.get(i);
            }
        }
        return max;
    }
    
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(2);
        a.add(6);
        a.add(7);
        a.add(10);
        a.add(1);
        
        System.out.println("max of array: " + max(a));
        
        ArrayList<Character> b = new ArrayList<>();
        b.add('f');
        b.add('a');
        b.add('c');
        b.add('k');
        b.add('z');
        b.add('m');
        
        System.out.println("max of array: " + max(b));
        
        Random random = new Random();
        ArrayList<Double> c = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            c.add(random.nextDouble() * 100);//sinh so ngau nhien
        }
        System.out.println("max of array: " + max(c));
    }
}

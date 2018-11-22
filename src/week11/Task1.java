package week11;

import java.util.Arrays;

public class Task1{

    /**
     *
     * @param <T>
     * @param a
     */
    public static <T extends Comparable<T>> void sapXepNoiBot(T a[]){
        int n = a.length;
        for (int i = 0 ; i < n-1 ; i++){
            for (int j = i+1 ; j < n ; j++){
                if(a[i].compareTo(a[j]) > 0){
                    T temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        Integer[] Iarr = {0, 4, 2, 3, 9, 6};
        System.out.println("Truoc khi sap xep: " + Arrays.toString(Iarr));
        sapXepNoiBot(Iarr);
        System.out.println("Sau khi sap xep: " + Arrays.toString(Iarr));
        
        System.out.println("----------------------------------------------");
        
        Double dArr[] = {3.05, 4.6, 9.25, 5.45};
        System.out.println("Truoc khi sap xep: " + Arrays.toString(dArr));
        sapXepNoiBot(dArr);
        System.out.println("Sau khi sap xep: " + Arrays.toString(dArr));
        
        System.out.println("----------------------------------------------");
        
        Character charArr[] = {'e', 'c', 'd', 'a'};
        System.out.println("Truoc khi sap xep: " + Arrays.toString(charArr));
        sapXepNoiBot(charArr);
        System.out.println("Sau khi sap xep: " + Arrays.toString(charArr));
        
    }
    
    
}

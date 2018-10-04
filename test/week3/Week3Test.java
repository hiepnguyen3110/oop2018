package week3;

import static org.junit.Assert.*;
import org.junit.Test;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test 
    public void testMax(){
        assertEquals(4, Week3.max(2, 4));
        assertEquals(39, Week3.max(23, 39));
        assertEquals(23, Week3.max(23, 10));
        assertEquals(31, Week3.max(5, 31));
        assertEquals(99, Week3.max(75, 99));
        
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int arr1[] = {1, 34, 39, 23, 56, 67};
        int arr2[] = {2, 34, 56, 78, 37, 25, 95};
        int arr3[] = {34, 4, 9, 62, 91};
        int arr4[] = {46, 56, 26, 75, 93, 3, 23};
        int arr5[] = {34, 78, 9, 63, 42};
        
        assertEquals(1, Week3.minOfArray(arr1));
        assertEquals(2, Week3.minOfArray(arr2));
        assertEquals(4, Week3.minOfArray(arr3));
        assertEquals(3, Week3.minOfArray(arr4));
        assertEquals(9, Week3.minOfArray(arr5));
        
    }
    
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        assertEquals("Thieu can", Week3.calculateBMI(45, 1.75));
        assertEquals("Binh thuong", Week3.calculateBMI(65, 1.7));
        assertEquals("Thua can", Week3.calculateBMI(62, 1.6));
        assertEquals("Beo phi", Week3.calculateBMI(90, 1.71));
        assertEquals("Binh thuong", Week3.calculateBMI(70, 1.73));
        
    }
   
}

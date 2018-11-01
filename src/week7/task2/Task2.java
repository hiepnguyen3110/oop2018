package week7.task2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ExpressionTest {
 
    public static void array() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 0};
        System.out.println(arr[3]);

    }

    public static void split() throws ArithmeticException {
        int a = 10 / 0;
        System.out.println(a);

    }

    @SuppressWarnings("null")
    public static void Null() throws NullPointerException {
        String n = null;
        System.out.println(n.length());

    }

    public static void cast() throws ClassCastException {
        Object x = 0;
        System.out.println((String) x);

    }

    @SuppressWarnings({"resource"})
    public static void File() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));

        String line = br.readLine();

        while (line != null) {
            System.out.println(line);
        }

    }
}

public class Task2 {

    public static void main(String[] args) {
        try {
            ExpressionTest.array();
        } catch (ArrayIndexOutOfBoundsException erro) {
            System.out.println(erro);
        }

        try {
            ExpressionTest.split();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            ExpressionTest.Null();

        } catch (NullPointerException e1) {
            System.out.println(e1);
        }

        try {
            ExpressionTest.cast();

        } catch (ClassCastException e) {
            System.out.println(e);
        }

        try {
            ExpressionTest.File();

        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            ExpressionTest.File();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

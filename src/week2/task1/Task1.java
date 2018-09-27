package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if(n == 0 || n == 1 ) return n;
        if(n == 2) return 1;
        for( int i = 3; i <= n; i++){
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
        return fn;
    }
}

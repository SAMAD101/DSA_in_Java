import java.util.Scanner;
import java.io.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int res = fib(n);
        System.out.println(res);
    }

    public static int fib(int n){
        if (n<=1){
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}

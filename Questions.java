import java.util.Scanner;
import java.io.*;
import java.lang.Math;

public class Questions {
    public static void main(String[] args) {
        System.out.println("For checking prime and armstrong: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(isPrime(a));
        System.out.println(isArmstrong(b));

        // All three digit armstrong numbers
        System.out.println("3 digit Armstrong numbers.");
        for(int i=100; i<999; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n){
        if(n%2 == 0){ return false; }

        int limit = (int) Math.sqrt(n);
        for(int i=3; i<limit; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArmstrong(int n){
        int p = String.valueOf(n).length(); // power
        int temp = n, sum = 0;
        while(temp>1){
            sum += (int) Math.pow(temp%10, p);
            temp /= 10;
        }
        sum += (int) Math.pow(temp%10, p);
        if(sum==n){
            return true;
        }
        return false;
    }
}

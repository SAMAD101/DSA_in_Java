import java.util.Scanner;
import java.io.*;

public class Swap {
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        swap(a, b); // this won't work as java uses pass by value
        System.out.println(a);
        System.out.println(b);

        int  arr[] = {1 ,2, 3};
        change(arr); // this works because arr are sent by pass by copy of reference
        // but this thing won't work with String as they have final modifier
        System.out.println(arr[0]);
    }

    public static void swap(int a, int b){
        a = a + b;
        b = a-b;
        a = a-b;
    }

    public static void change(int[] arr){
        arr[0] = 0;
    }
}

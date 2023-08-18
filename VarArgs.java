import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5);
    }

    public static void fun(int ...args){
        // somthing similar to *args in Python
        System.out.println(Arrays.toString(args));
    }
}

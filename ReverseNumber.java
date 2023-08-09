import java.util.Scanner;
import java.io.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int res = reverseNumber(n);
        System.out.println(res);
    }

    public static int reverseNumber(int n){
        int[] digits = new int[Integer.toString(n).length()];
        int i = 0;

        while (n > 0) {
            digits[i] = n % 10;
            n /= 10;
            i++;
        }

        String r = "";
        for (int j=0; j<digits.length; j++) {
            r += digits[j];
        }
        int res = Integer.parseInt(r);

        return res;
    }
}

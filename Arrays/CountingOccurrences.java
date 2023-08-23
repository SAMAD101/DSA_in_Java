package Arrays;
import java.util.Scanner;


public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine(); // the string+
        char tch = inp.nextLine().trim().charAt(0); // the char to be counted in the string

        int res = countOccurrences(str, tch);
        System.out.println(res);
    }

    public static int countOccurrences(String str, char tch){
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == tch) {
                count++;
            }
        }
        return count;
    }
}

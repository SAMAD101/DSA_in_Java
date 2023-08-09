import java.util.Scanner;
import java.io.*;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine().trim();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                System.out.println(ch + " : Lowercase");
            } else if(ch >= 'A' && ch <= 'Z'){
                System.out.println(ch + " : Uppercase");
            }
        }
    }
}

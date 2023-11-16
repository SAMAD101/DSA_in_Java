package Stack;

import java.util.*;
public class Leetcode_1047 {
    public static void main(String[] args) {
        String s = "aaaaaaaaa";
        s = removeDuplicates(s);
        System.out.println(s);
    }

    public static String removeDuplicates(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch: stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}

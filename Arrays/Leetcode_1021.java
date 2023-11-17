package Arrays;

public class Leetcode_1021 {
    public static void main(String[] args) {
        String s = "(()())(())";
        s = removeOuterParenthesis(s);
        System.out.println(s);
    }

    public static String removeOuterParenthesis(String s){
        int len = s.length();
        if (len <= 2) return "";
        char[] c = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        int open = 1;
        for (int i = 1; i < len; i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1) newString.append('(');
            }
            else {
                if (open > 1) newString.append(')');
                open--;
            }
        }
        return newString.toString();
    }
}

// This solution fails the time limit because it was supposed to be done using Stack. So the more efficient solution is there in Stack folder.

package Arrays;

public class Leetcode_1047 {
    public static void main(String[] args) {
        String s = "aaaaaaaaa";
        s = removeDuplicates(s);
        System.out.println(s);
    }

    public static String removeDuplicates(String s){
        StringBuilder sb = new StringBuilder(s);
        boolean flag = true;
        while(flag){
            if(sb.length()==1)
                break;
            for(int i=0; i<sb.length()-1; i++){
                if(sb.charAt(i)==sb.charAt(i+1)){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    flag = true;
                    i = sb.length();
                }else{
                    flag = false;
                }
            }
        }
        s = sb.toString();
        return s;
    }
}

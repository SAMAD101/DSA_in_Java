package Arrays;

public class Leetcode_390 {
    public static void main(String[] args) {
        System.out.println(lastRemaining(9));
    }

    public static int lastRemaining(int n) {
        int[] arr = new int[n];
        for(int i=1; i<n+1; i++){
            arr[i-1] = i;
        }

        for(int i=0; i<arr.length; i+=2){
            arr[i] = 0;
        }
        for(int i=(arr.length-2); i>0; i-=2){
            arr[i] = 0;
        }

        int res = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                res = arr[i];
            }
        }

        return res;
    }
}

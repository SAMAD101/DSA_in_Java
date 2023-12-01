package Arrays;
import java.util.*;

public class Leetcode_2784 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3};
        System.out.println(isGood(arr));
    }

    public static boolean isGood(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return false;
        }
        else{
            int ans=nums.length-1;
            int count=1;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==count){
                    count++;
                }
                else{
                    return false;
                }
            }
            if(count-1==nums[nums.length-1]){
                return true;
            }
        }
        return false;
    }
}

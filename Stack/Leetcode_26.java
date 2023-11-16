package Stack;

import java.util.*;
public class Leetcode_26 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        removeDuplicate(nums);

    }

    public static int removeDuplicate(int[] nums){
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<nums.length; i++){
            if(!stack.isEmpty() && stack.peek()==nums[i])
                continue;
            else
                stack.push(nums[i]);
            nums[index] = nums[i];
            index++;
        }
        return stack.size();
    }
}

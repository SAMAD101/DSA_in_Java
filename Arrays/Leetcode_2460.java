package Arrays;

public class Leetcode_2460 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 0};
        nums = applyOperations(nums);
        System.out.println(nums);
    }

    public static int[] applyOperations(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1] && nums[i]!=0){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i=index; i<nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }
}

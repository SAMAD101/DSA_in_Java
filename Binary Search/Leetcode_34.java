public class Leetcode_34 {
    public static void main(String[] args) {

    }

    public static int[] searchRange(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = (int) (start+end)/2;
            if(nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return ;
    }
}

package Arrays;

import java.util.*;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 7};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> ranges = new ArrayList<>();
        int lower = nums[0];
        int upper = nums[0];
        int index = 0;
        while(index<nums.length){
            if(index == nums.length-1){
                upper = nums[index];
                if(lower == upper){
                    ranges.add(Integer.toString(lower));
                }else{
                    ranges.add(Integer.toString(lower) + "->" + Integer.toString(upper));
                }
            }else if(nums[index+1] > nums[index]+1){
                upper = nums[index];
                if(lower == upper){
                    ranges.add(Integer.toString(lower));
                }else{
                    ranges.add(Integer.toString(lower) + "->" + Integer.toString(upper));
                }
                lower = nums[index+1];
            }
            index++;
        }
        return ranges;
    }
}

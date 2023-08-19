import java.util.*;
import java.io.*;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,99};
        int index = binarySearch(arr, 4, 0, 6);
        System.out.println(index);
    }

    public static int binarySearch(
            int[] sortedArray, int key, int low, int high){
        int mid = (int) (low+high)/2;
        while(high>=low){
            if(sortedArray[mid]==key){
                return mid;
            }else if(sortedArray[mid]>key){
                high = mid-1;
            }else if(sortedArray[mid]<key){
                low = mid+1;
            }
        } return -1;
    }
}

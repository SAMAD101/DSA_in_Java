import java.util.*;
import java.io.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,99};
        int index = runBinarySearchRecursively(arr, 4, 0, 6);
        System.out.println(index);
    }

    public static int runBinarySearchRecursively(
            int[] sortedArray, int key, int low, int high) {
        int middle = (int) (low+high)/2;

        if (high < low) {
            return -1;
        }
        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return runBinarySearchRecursively(
                    sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively(
                    sortedArray, key, middle + 1, high);
        }
    }
}

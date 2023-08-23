package Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,332,45,34,9,57};
        linearSearch(arr, 2);
    }

    public static void linearSearch(int[] arr, int ele){
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == ele) {
                System.out.println(ele + " found at index " + i);
            }
        }
    }
}

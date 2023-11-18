public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int ceiling = findCeiling(arr, 10);
        System.out.println(ceiling);
    }

    public static int findCeiling(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int mid = (int) (low+high)/2;
        while(low<=high){
            mid = (int) (low+high)/2;

            if(target == arr[mid]){
                return arr[mid];
            }else if(target < arr[mid]){
                high = mid-1;
            }else if(target > arr[mid]){
                low = mid+1;
            }
        }
        if(low< arr.length)
            return arr[low];
        return -1;
    }
}

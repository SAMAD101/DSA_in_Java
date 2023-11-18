public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int floor = findFloor(arr, 15);
        System.out.println(floor);
    }

    public static int findFloor(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        boolean isAsc = arr[low] < arr[high];
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
        return arr[high];
    }
}

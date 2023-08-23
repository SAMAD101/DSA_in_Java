public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {99,8,6,4,3,2,1};
        int index = binarySearch(arr, 6, 0, 6);
        System.out.println(index);
    }

    public static int binarySearch(
            int[] sortedArray, int key, int head, int tail){

        boolean isAsc = sortedArray[head] < sortedArray[tail];

        while(head<=tail){
            int mid = (int) (head+tail)/2;

            if(key==sortedArray[mid]){
                return mid;
            }
            if(isAsc){
                if(key<sortedArray[mid]){
                    tail = mid-1;
                }else{  // key>sortedArray[mid
                    head = mid+1;
                }
            }else{
                if(key<sortedArray[mid]){
                    head = mid+1;
                }else{  // key>sortedArray[mid
                    tail = mid-1;
                }
            }
        }
        return -1;
    }
}

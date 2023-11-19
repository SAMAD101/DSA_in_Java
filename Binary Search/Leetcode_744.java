public class Leetcode_744 {
    public static void main(String[] args) {
        char[] letters = {'a', 'a', 's', 'l', 'p'};
        System.out.println(nexGreaterLetter(letters, 'a'));
    }

    public static char nexGreaterLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int mid = (int) (start+end)/2;
            if(letters[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return letters[start % letters.length];
    }
}


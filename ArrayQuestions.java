import java.util.*;
import java.io.*;

public class ArrayQuestions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(1);
        arr.add(3);
        arr.add(23);
        arr.add(9);
        arr.add(18);
        System.out.println(arr);

        System.out.println("Max: "+max(arr));
        System.out.println("Reversed:");
        arr = reverse(arr);
        System.out.println(arr);
    }

    public static int max(ArrayList<Integer> arr){
        int mv = arr.get(0);
        for(int i=1; i<arr.size(); i++){
            if(arr.get(i)>mv){
                mv = arr.get(i);
            }
        }
        return mv;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        for(int i=0; i<(int)arr.size()/2; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(arr.size()-i-1));
            arr.set(arr.size()-i-1, temp);
        }
        return arr;
    }
}

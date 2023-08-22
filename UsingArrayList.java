import java.util.*;
import java.io.*;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(6); // item added
        list.set(0, 9); // item at index 0 set to 99
        System.out.println(list);


    }
}

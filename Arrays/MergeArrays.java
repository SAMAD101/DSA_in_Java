// https://www.hackerrank.com/test/8b1rlj0b18q/questions/1d1bn4gtk

package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class MergeArrays {

    /*
     * Complete the 'mergeArrays' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static void main(String[] args) {
            // if(a.size() <= 1 || a.size() >= 500000 || b.size() <= 1 || b.size() >= 500000){
            //     return null;
            // }
            ArrayList<Integer> a = new ArrayList<>(3);
            a.add(1); a.add(2); a.add(3);
            ArrayList<Integer> b = new ArrayList<>(3);
            b.add(2); b.add(5); b.add(5);

            ArrayList<Integer> res = new ArrayList<Integer>(a.size() + b.size());
            int i=0;
            int j=0;
            while(i<a.size() && j< b.size()) {
                if (a.get(i) > b.get(j)) {
                    res.add(b.get(j));
                    j++;
                    continue;
                } else if (a.get(i) < b.get(j)) {
                    res.add(a.get(i));
                    i++;
                    continue;
                } else {
                    res.add(a.get(i));
                    res.add(b.get(j));
                    i++;
                    j++;
                    continue;
                }
            }
            res.addAll(i, a);
            res.addAll(j, b);

            for(int k=0; k<res.size(); k++){
                System.out.println(res.get(k));
            }
    }
}

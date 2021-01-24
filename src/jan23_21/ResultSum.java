/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 23-Jan-21
 *   Time: 12:01 AM
 *   File: ResultSum.java
 */

package jan23_21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ResultSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int temp = (int) (Math.random() * 10);
            arr.add(temp);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        Collections.sort(arr);
        final int RESULTSUM = 10;
        int start = 0;
        //can be done using HashSet -> for this we have to make a class of Pair for storing the pair in the HashSet
        HashMap<Integer, Integer> result = new HashMap<>();
        int last = arr.size() - 1;
        while (start < last) {
            if (arr.get(start) + arr.get(last) == RESULTSUM) {
                result.put(arr.get(start), arr.get(last));
                start++;
                last--;
            } else if (arr.get(start) + arr.get(last) > RESULTSUM) {
                last--;
            } else {
                start++;
            }
        }
        for (Integer k : result.keySet()) {
            System.out.println(k + " " + result.get(k));
        }
    }
}


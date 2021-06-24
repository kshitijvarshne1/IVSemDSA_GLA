/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Jun-21
 *   Time: 12:28 PM
 *   File: DuplicateArray.java
 */

package June.jun24_21;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 8, 1, 9, 2, 3, 8, 6, 9, 1};
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            if (mp.containsKey(i)) {
                int count = mp.get(arr[i]);
                mp.put(arr[i], count + 1);
            } else {
                mp.put(i, 1);
            }
        }
        for (var i : mp.entrySet()) {
            //System.out.println(i.getKey()+" "+i.getValue());
            if (i.getValue() > 1) {
                System.out.print(i.getKey() + " ");
            }
        }
    }
}


/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Jun-21
 *   Time: 8:48 AM
 *   File: SingleDimensionArray.java
 */

package June.jun21_21;

public class SingleDimensionArray {
    int[] arr = null;

    public SingleDimensionArray(int size) {
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
}


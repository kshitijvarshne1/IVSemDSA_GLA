/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-Apr-21
 *   Time: 11:29 PM
 *   File: BSTUsingArray.java
 */

package April.api06_21_NK;

public class BSTUsingArray {
    public int[] arr;

    public BSTUsingArray(int size) {
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = -1;
        }
    }
}


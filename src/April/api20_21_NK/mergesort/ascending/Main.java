/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 23-Apr-21
 *   Time: 5:21 PM
 *   File: Main.java
 */

package April.api20_21_NK.mergesort.ascending;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {10, 7, 9, 5, 3, 8};
        MergeSort m = new MergeSort();
        m.mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}


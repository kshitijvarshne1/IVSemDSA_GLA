/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 23-Apr-21
 *   Time: 6:54 PM
 *   File: Main.java
 */

package April.api20_21_NK.mergesort.OptiMergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 6, 9, 4, 3};
        MergeSort m = new MergeSort();
        System.out.println(Arrays.toString(a));
        m.mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

}


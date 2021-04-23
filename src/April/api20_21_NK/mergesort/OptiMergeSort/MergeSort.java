/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 23-Apr-21
 *   Time: 6:54 PM
 *   File: MergeSort.java
 */

package April.api20_21_NK.mergesort.OptiMergeSort;

public class MergeSort {
    public void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int mid = l + r / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }

    public void merge(int[] a, int l, int mid, int r) {

    }
}


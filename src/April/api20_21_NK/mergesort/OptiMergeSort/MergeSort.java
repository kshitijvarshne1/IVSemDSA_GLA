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
        int n1 = mid - l + 1;
        int n2 = r - (mid + 1) + 1; //== r-mid
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = a[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = a[mid + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i += 1;
            } else {
                a[k] = R[j];
                j += 1;
            }
            k += 1;
        }
        while (i < mid) {
            a[k] = a[i];
            i += 1;
            k += 1;
        }
        while (j < r) {
            a[k] = a[j];
            j += 1;
            k += 1;
        }
    }
}


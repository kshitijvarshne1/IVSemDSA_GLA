/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 23-Apr-21
 *   Time: 5:20 PM
 *   File: MergeSort.java
 */

package April.api20_21_NK.mergesort.ascending;

public class MergeSort {
    int[] arr;

    public MergeSort(int size) {
        arr = new int[size];
    }

    public void mergeSort(int a[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, r, mid);
        }
    }

    public void merge(int a[], int l, int r, int mid) {
        int i = l;
        int j = mid + 1;
        int k = l;
        while (i <= mid && j <= r) {
            if (a[i] <= a[j]) {
                arr[k] = arr[i];
                i += 1;
            } else {
                arr[k] = a[j];
                j += 1;
            }
            k += 1;
        }

    }
}


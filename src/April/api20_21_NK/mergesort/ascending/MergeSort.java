/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 23-Apr-21
 *   Time: 5:20 PM
 *   File: MergeSort.java
 */

package April.api20_21_NK.mergesort.ascending;

public class MergeSort {
    public void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }

    public void merge(int[] a, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid; // r-(mid+1)+1

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = a[mid + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

}

/*

int i = l;
        int j = mid + 1;
        int k = l;
        while (i <= mid && j <= r) {
            if (a[i] <= a[j]) {
                arr[k] = a[i];
                i += 1;
            } else {
                arr[k] = a[j];
                j += 1;
            }
            k += 1;
        }

        if (i > mid) {
            while (j <= r) {
                arr[k] = a[j];
                j += 1;
                k += 1;
            }
        } else {
            while (i <= mid) {
                arr[k] = a[i];
                i += 1;
                k += 1;
            }
        }

* */
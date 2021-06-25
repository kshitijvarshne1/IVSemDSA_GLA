/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Jun-21
 *   Time: 6:45 PM
 *   File: SelectionSort.java
 */

package June.jun25_21;

import java.util.Arrays;

/*
 * break into two half
 * one is sorted and other is unsorted
 * Node just find the minimum element and send to the sorted half
 *
 * */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 42, 71, 4, 63, 5};
        sSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static void sSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(arr, i, min);
            }
        }
    }

    public static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}


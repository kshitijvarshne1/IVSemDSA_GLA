/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Jun-21
 *   Time: 11:24 AM
 *   File: QuickSort.java
 */

package June.jun25_21;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 99, 4, 2, 77};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);

        }
    }

    private static int partition(int[] arr, int low, int high) {
        int tempPivot = arr[high];
        // i=> last number which is less than pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < tempPivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


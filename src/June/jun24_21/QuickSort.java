/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Jun-21
 *   Time: 1:50 PM
 *   File: QuickSort.java
 */

package June.jun24_21;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {346, 22, 31, 212, 57, 102, 568, 435, 8, 14, 5};
        System.out.println("before sorting");
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i + 1];
        arr[i] = arr[high];
        arr[high] = tmp;
        return (i + 1);
    }
}


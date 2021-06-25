/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Jun-21
 *   Time: 11:24 AM
 *   File: QuickSort.java
 */

package June.jun25_21;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 99, 4, 2, 77};
        quicksort(arr, 0, arr.length - 1);
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
    }
}


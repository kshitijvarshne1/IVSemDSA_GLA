/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 29-Apr-21
 *   Time: 5:23 PM
 *   File: Main.java
 */

package April.api29_21_NK;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 9, 1, 55, 3, 22, 66, 90};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int pivot = partition(a, start, end);
            quickSort(a, start, pivot - 1);
            quickSort(a, pivot + 1, end);

        }
    }

    private static int partition(int[] a, int start, int end) {
        // taking pivot as last element
        int pivot = a[end];
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        return i;

    }
}


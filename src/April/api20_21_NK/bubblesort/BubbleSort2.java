/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-Apr-21
 *   Time: 6:13 PM
 *   File: BubbleSort2.java
 */

package April.api20_21_NK.bubblesort;

import java.util.Arrays;

//The above function always runs O(n^2) time even if the array is sorted. It can be optimized by stopping the algorithm if inner loop didn’t cause any swap.

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int p = 1;
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // if there is no swapping means array is already sorted
            if (swapped == false) {
                break;
            }
            System.out.println("Psss No. " + p);
            p += 1;
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }
        System.out.println("==== result ====");
        System.out.println(Arrays.toString(arr));
    }
}
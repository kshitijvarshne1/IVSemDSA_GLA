/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-Apr-21
 *   Time: 6:47 PM
 *   File: SelectionSortAscending.java
 */

package April.api20_21_NK.selectionsort;
//Selection Sort -> combination of searching and swaping


/*
The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted. ( initially it is empty )
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.*/

import java.util.Arrays;

public class SelectionSortAscending {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}


/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-Apr-21
 *   Time: 7:03 PM
 *   File: SelectionSortDescending.java
 */

package April.api20_21_NK.selectionsort;

import java.util.Arrays;

public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            int max_value_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max_value_index]) {
                    max_value_index = j;
                }
            }

            int temp = arr[max_value_index];
            arr[max_value_index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}


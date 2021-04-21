/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Apr-21
 *   Time: 8:51 PM
 *   File: BubbleSort3DESC.java
 */

package April.api20_21_NK.bubblesort;

import java.util.Arrays;

public class BubbleSort3DESC {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int p = 1;
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
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


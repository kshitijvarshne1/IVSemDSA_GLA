/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-Apr-21
 *   Time: 6:13 PM
 *   File: BubbleSort2.java
 */

package April.api20_21_NK.bubblesort;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int p = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Psss No. " + p);
            p += 1;
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }
}
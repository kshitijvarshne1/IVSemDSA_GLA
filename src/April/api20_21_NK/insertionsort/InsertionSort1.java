/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-Apr-21
 *   Time: 7:12 PM
 *   File: InsertionSort1.java
 */

package April.api20_21_NK.insertionsort;

public class InsertionSort1 {
    public static void main(String[] args) {
        int[] a = {5, 4, 10, 1, 6, 2};
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }
    }
}


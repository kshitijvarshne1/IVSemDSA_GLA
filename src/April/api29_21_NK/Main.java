/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 29-Apr-21
 *   Time: 5:23 PM
 *   File: Main.java
 */

package April.api29_21_NK;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 9, 1, 55, 3, 22, 66, 90};
        quickSort(a, 0, a.length);
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int pivot = partition(a, start, end);
        }
    }

    private static int partition(int[] a, int start, int end) {
    }
}


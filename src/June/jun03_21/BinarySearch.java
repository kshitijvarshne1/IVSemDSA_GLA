/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Jun-21
 *   Time: 11:45 AM
 *   File: BinarySearch.java
 */

package June.jun03_21;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 42, 52, 100, 311};
        System.out.println(search(arr, 0, arr.length - 1, 100));
        System.out.println(search(arr, 0, arr.length - 1, 10));
    }

    public static boolean search(int[] arr, int l, int r, int ele) {

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == ele) {
                return true;
            }
            if (ele < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return false;
    }
}


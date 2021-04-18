/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Apr-21
 *   Time: 6:18 PM
 *   File: RecursiveBinarySearch.java
 */

package April.api18_21_NK;

import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :-");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the search element");
        int element = sc.nextInt();
        System.out.println(recursiveBinarySearch(a, 0, a.length - 1, element));
    }

    private static int recursiveBinarySearch(int[] a, int s, int e, int element) {
        if (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == element) {
                return mid;
            }
            if (a[mid] > element) {
                return recursiveBinarySearch(a, s, mid - 1, element);
            } else {
                return recursiveBinarySearch(a, mid + 1, e, element);
            }
        }
        return -1;
    }

}


/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Apr-21
 *   Time: 6:10 PM
 *   File: BinarySearch.java
 */

package April.api18_21_NK;

import java.util.Scanner;

public class BinarySearch {
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
        System.out.println(BinarySearch(a, element));
    }

    private static int BinarySearch(int[] a, int element) {
        int s = 0;
        int e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == element) {
                return mid;
            }
            if (a[mid] > element) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}


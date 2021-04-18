/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Apr-21
 *   Time: 5:44 PM
 *   File: LinearSearch.java
 */

package April.api18_21_NK;

import java.util.Scanner;

public class LinearSearch {
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
        System.out.println(searchElement(a, element));
    }
    private static int searchElement(int[] a, int element) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                return i;
            }
        }
        return -1;
    }
}


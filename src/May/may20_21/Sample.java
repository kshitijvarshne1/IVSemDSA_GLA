/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-May-21
 *   Time: 6:16 PM
 *   File: Sample.java
 */

package May.may20_21;

public class Sample {
    public static void main(String[] args) {
        int n = 5;
        // O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        // o(n^2)
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                System.out.print(i1 + " ");
            }
            System.out.println();
        }
        //O(n log n)
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < n; i1 += 2) {
                System.out.print(i1 + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i += 2) {
            for (int i1 = 0; i1 < n; i1++) {
                System.out.print(i1 + " ");
            }
            System.out.println();
        }
    }
}


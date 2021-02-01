/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Feb-21
 *   Time: 10:43 AM
 *   File: Three.java
 */

package feb01_21;

public class Three {
    public static void main(String[] args) {
        int n = 600;
        Recursion(n);
    }

    public static void Recursion(int n) {
        if (n == 0) {
            return;
        }
        Recursion(n - 1);
        System.out.println(n);
    }
}


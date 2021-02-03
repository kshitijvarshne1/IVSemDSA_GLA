/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Feb-21
 *   Time: 10:43 AM
 *   File: Three.java
 */

package feb01_21_NK;

public class Three {
    public static void main(String[] args) {
        int n = 600;
        Recursion(n);
    }

    public static void Recursion(int n) {
        if (n == 0) {
            return;
        }
        //Hail Recursion
        Recursion(n - 1);
        System.out.println(n);
        // This function print the numbers in increasing order ( 1,2,3,4,5,6,7.......)
    }
}


// For the tail recursion
    /*
    public static void Recursion(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Recursion(n - 1);
        //Tail recursion

    }*/
//  This function print the numbers in reverse order

/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-Mar-21
 *   Time: 1:51 AM
 *   File: FibonacciUsingIteration.java
 */

package March.mar06_21_NK;

import java.util.Scanner;

public class FibonacciUsingIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= n; i++) {
            System.out.print(a + b + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}


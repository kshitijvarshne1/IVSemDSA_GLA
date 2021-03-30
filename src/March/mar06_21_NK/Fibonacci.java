/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-Mar-21
 *   Time: 1:36 AM
 *   File: Fibonacci.java
 */

package March.mar06_21_NK;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        //System.out.println(fibonacci(BigInteger.valueOf(n)));
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(BigInteger.valueOf(i)) + " ");
        }

    }

    public static BigInteger fibonacci(BigInteger n) {
        if (n.compareTo(BigInteger.ZERO) == 0) {
            return BigInteger.ZERO;
        } else if (n.compareTo(BigInteger.valueOf(1)) == 0) {
            return BigInteger.ONE;
        } else {
            return fibonacci(n.subtract(BigInteger.ONE)).add(fibonacci(n.subtract(BigInteger.valueOf(2))));
        }
    }
}


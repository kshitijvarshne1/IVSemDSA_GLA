/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-May-21
 *   Time: 2:59 PM
 *   File: one.java
 */

package IntQues;

import java.util.Scanner;

// print the fibonacci in reverse order t.c -> o(n) and space o(1)
/*
 * input 21
 * output 21 13 8 5 3 2 1 1 0
 *
 *
 * input 13
 * output 13 8 5 3 2 1 1 0
 *
 *
 * max element 52th
 * */
public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n, 0, 1);
        System.out.print(1 + " " + 0 + " ");
    }

    private static void fib(int n, int a, int b) {
        int sum = 0;
        int prev = a;
        int next = b;
        for (int i = 0; i < n; i++) {
            sum = prev + next;
            prev = next;
            next = sum;
            if (sum >= n) {
                break;
            }
        }
        do {
            System.out.print(sum + " ");
            int k = sum - prev;
            sum = prev;
            prev = k;
        }
        while (sum != 1);
        System.out.print(1 + " ");
    }
}



/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 16-Feb-21
 *   Time: 11:17 PM
 *   File: InfixToPostfix.java
 */

package feb16_21_NK;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(InfixToPostfixConversion(input));
    }

    private static String InfixToPostfixConversion(String input) {
        Stack stack = new Stack();
        String result = "";

        return result;
    }

    private static int precedence(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else {
            return -1;
        }
    }
}


/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Mar-21
 *   Time: 5:43 PM
 *   File: PrefixToPostfix.java
 */

package February.feb16_21_NK;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prefix = sc.next();
        System.out.println("Prefix:- " + prefix);
        System.out.println("Postfix:- " + convertPrefixToPostfix(prefix));

    }

    private static String convertPrefixToPostfix(String prefix) {
        Stack<String> stack = new Stack();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            if (isOperator(prefix.charAt(i))) {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                String temp = op1 + op2 + prefix.charAt(i);
                stack.push(temp);
            } else {
                stack.push(prefix.charAt(i) + "");
            }
        }
        return stack.peek();
    }

    public static boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '/':
            case '*':
            case '^':
                return true;
        }
        return false;
    }
}


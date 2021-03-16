/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Mar-21
 *   Time: 1:24 AM
 *   File: PostfixToPrefix.java
 */

package March.mar17_21_NK;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String postfix = sc.next();
        String result = convertPostfixToPrefix(postfix);
        System.out.println(result);
    }

    private static String convertPostfixToPrefix(String postfix) {
        Stack<String> stack = new Stack();
        for (int i = 0; i < postfix.length(); i++) {
            if (isOperator(postfix.charAt(i))) {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                String temp = postfix.charAt(i) + op2 + op1;
                stack.push(temp);
            } else {
                stack.push(postfix.charAt(i) + "");
            }
        }
        String result = new String();
        for (String s : stack) {
            result += s;
        }

        return result;
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




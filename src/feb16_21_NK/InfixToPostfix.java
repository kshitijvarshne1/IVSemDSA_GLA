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

    private static StringBuilder InfixToPostfixConversion(String input) {
        Stack<Character> stack = new Stack();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.empty() && stack.peek() != '(') {
                    result.append(stack.peek());
                    stack.pop();
                }
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                while (!stack.empty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.peek());
                    stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.empty()) {
            result.append(stack.peek());
            stack.pop();
        }
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

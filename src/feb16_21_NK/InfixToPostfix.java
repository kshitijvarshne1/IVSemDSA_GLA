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
                evaluate(stack, result, c);

            }
        }
        while (!stack.empty()) {
            result.append(stack.peek());
            stack.pop();
        }

        return result;
    }

    private static void evaluate(Stack<Character> stack, StringBuilder result, char c) {
        if (!stack.empty() && precedence(stack.peek()) == precedence(c)) {
            if (precedenceAssociativity(stack.peek(), c) == 1) {
                result.append(stack.peek());
                stack.pop();
                stack.push(c);
            } else {
                stack.push(c);
            }
        } else if (precedence(stack.peek()) > precedence(c)) {
            while (!stack.empty() && precedence(stack.peek()) > precedence(c)) {
                result.append(stack.peek());
                stack.pop();
                evaluate(stack, result, stack.peek());
            }
            stack.push(c);
        } else {
            stack.push(c);
        }
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

    private static int precedenceAssociativity(char a, char b) {
        if (a == '+' && b == '-') {
            return 1;
        } else if (a == '*' && b == '/') {
            return 1;
        } else {
            return -1;
        }

    }
}


//a+b*c-d/f+g
/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 13-Feb-21
 *   Time: 7:03 PM
 *   File: BalancedParenthesis.java
 */

package February.feb13_21_NK_P.two;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parenthesis = sc.nextLine();
        System.out.println(checkAllBrackets(parenthesis));
    }

    private static boolean checkAllBrackets(String parenthesis) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < parenthesis.length(); i++) {
            if (parenthesis.charAt(i) == '(' || parenthesis.charAt(i) == '{' || parenthesis.charAt(i) == '[') {
                stack.push(parenthesis.charAt(i));
            } else if (parenthesis.charAt(i) == ')' || parenthesis.charAt(i) == '}' || parenthesis.charAt(i) == ']') {
                if (!stack.empty() && stack.peek() == '(' && parenthesis.charAt(i) == ')' || stack.peek() == '{' && parenthesis.charAt(i) == '}' || stack.peek() == '[' && parenthesis.charAt(i) == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private static boolean check(String parenthesis) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < parenthesis.length(); i++) {
            if (parenthesis.charAt(i) == '(') {
                stack.push('(');
            } else if (parenthesis.charAt(i) == ')') {
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}



    /*private static boolean checkAllBrackets(String parenthesis) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < parenthesis.length(); i++) {
            if (parenthesis.charAt(i) == '(' || parenthesis.charAt(i) == '{' || parenthesis.charAt(i) == '[') {
                stack.push(parenthesis.charAt(i));
            } else if (parenthesis.charAt(i) == ')' || parenthesis.charAt(i) == '}' || parenthesis.charAt(i) == ']') {
                if (!stack.empty() && stack.peek() == '(' && parenthesis.charAt(i) == ')') {
                    stack.pop();
                } else if (!stack.empty() && stack.peek() == '{' && parenthesis.charAt(i) == '}') {
                    stack.pop();
                } else if (!stack.empty() && stack.peek() == '[' && parenthesis.charAt(i) == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }*/
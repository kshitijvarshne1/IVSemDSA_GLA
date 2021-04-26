/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Mar-21
 *   Time: 10:11 PM
 *   File: EvaluationOfPostfix.java
 */

package March.mar17_21_NK;

import java.util.Scanner;
import java.util.Stack;

public class EvaluationOfPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String postfix = sc.nextLine();
        // System.out.println("Postfix Evaluation :-  " + Evaluation(postfix));
    }

    private static int Evaluation(String postfix) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;

                    case '-':
                        stack.push(val2 - val1);
                        break;

                    case '/':
                        stack.push(val2 / val1);
                        break;

                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}



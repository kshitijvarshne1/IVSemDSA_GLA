/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 13-Feb-21
 *   Time: 3:40 PM
 *   File: ReverseTheStackUsingOneVariable.java
 */

package February.feb13_21_NK_P.Reverse_The_Stack;

import java.util.Stack;

public class ReverseTheStackUsingOneVariable {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 50; i++) {
            stack.push(i);
        }
        reverseStack(stack);
        System.out.println("Reversed stack");
        while (!stack.empty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }

    }

    public static void transfer(Stack stack1, Stack stack2, int n) {
        for (int i = 0; i < n; i++) {
            stack2.push(stack1.peek());
            stack1.pop();
        }
    }

    public static void reverseStack(Stack stack) {
        Stack helperStack = new Stack();
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            //pick the element
            int x = (int) stack.peek();
            stack.pop();

            // Transfer (n-i-1 ) remaining element from s1 to s2
            transfer(stack, helperStack, n - i - 1);
            // insert the element x in s1
            stack.push(x);
            // Transfer (n-i-1 ) remaining element from s1 to s2
            transfer(helperStack, stack, n - i - 1);
        }
    }
}
// Time complexity o(n^2)
// Space Complexity o(n)
/*
 * Pseudocode
 * for each element in s1
 *   int s= s1.peek()
 *   extract n-1-i elements
 *   s1->s2
 *   s1.push(x)
 *   s2->s1
 * */

/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 13-Feb-21
 *   Time: 3:59 PM
 *   File: ReverseTheStackUsingRecursion.java
 */

package feb13_21_NK_P.Reverse_The_Stack;

import java.util.Stack;

public class ReverseTheStackUsingRecursion {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        reverseStack(stack);
        while (!stack.empty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }

    public static void insertAtBottom(Stack stack1, int x) {
        if (stack1.empty()) {
            stack1.push(x);
            return;
        }
        int data = (int) stack1.peek();
        stack1.pop();
        insertAtBottom(stack1, x);
        stack1.push(data);

    }

    public static void reverseStack(Stack stack) {
        if (stack.empty()) {
            return;
        }
        //pop out top the element and insert it at the bottom of reversed smaller stack
        int x = (int) stack.peek();
        stack.pop();
        //recursively reverse the smaller stack
        reverseStack(stack);
        insertAtBottom(stack, x);
    }
}


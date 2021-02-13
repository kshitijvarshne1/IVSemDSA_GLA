/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 13-Feb-21
 *   Time: 3:19 PM
 *   File: first.java
 */

package feb13_21_NK_P.Reverse_The_Stack;

import java.util.Stack;

public class first {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 50; i++) {
            stack.push(i);
        }
        Stack stack1 = new Stack();
        while (!stack.empty()) {
            System.out.print(stack.peek() + " -> ");
            stack1.push(stack.peek());
            stack.pop();
        }
        Stack stack2 = new Stack();
        while (!stack1.empty()) {
            stack2.push(stack1.peek());
            stack1.pop();
        }
        while (!stack2.empty()) {
            stack.push(stack2.peek());
            stack2.pop();
        }
        System.out.println("Reverse the stack using 2 stack");
        while (!stack.empty()) {
            System.out.print(stack.peek() + " -> ");
            stack.pop();
        }

    }
}

/*
 * Reverse the stack using 2 stack
 * */
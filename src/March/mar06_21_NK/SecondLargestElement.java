/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-Mar-21
 *   Time: 3:17 PM
 *   File: SecondLargestElement.java
 */

package March.mar06_21_NK;

import java.util.Stack;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] a = {6, 9, 3, 4, 5};
        System.out.println(find(a));
    }

    private static int find(int[] a) {
        Stack<Integer> stack = new Stack<>();
        for (int i : a) {
            if (stack.size() < 2) {
                if (stack.size() == 0) {
                    stack.push(i);
                } else {
                    if (stack.peek() > i) {
                        stack.push(i);
                    } else {
                        int x = stack.pop();
                        stack.push(i);
                        stack.push(x);
                    }
                }
            } else if (stack.peek() < i) {
                int temp = stack.pop();
                if (stack.peek() < i) {
                    int x = stack.pop();
                    stack.push(i);
                    stack.push(x);
                } else {
                    stack.push(i);
                }
            }
        }
        return stack.pop();
    }
}


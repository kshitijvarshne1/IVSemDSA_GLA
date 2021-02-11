/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-Feb-21
 *   Time: 3:29 PM
 *   File: StackDemo.java
 */

package feb11_21.one;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDemo {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        /*var popValue = stack.pop();
        System.out.println(popValue);
        var topValue= stack.peek();
        System.out.println(topValue);*/
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}


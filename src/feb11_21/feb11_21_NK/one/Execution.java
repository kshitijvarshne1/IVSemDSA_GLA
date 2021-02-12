/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-Feb-21
 *   Time: 6:23 PM
 *   File: Execution.java
 */

package feb11_21.feb11_21_NK.one;

public class Execution {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        for (int i = 1; i < 10; i++) {
            stack.push(i * i);
        }
        stack.push(101);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.push(99);
        stack.pop();
        stack.push(444);
        stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        stack.deleteStack();
    }
}

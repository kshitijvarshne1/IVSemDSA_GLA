/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-Feb-21
 *   Time: 10:35 AM
 *   File: Execution.java
 */

package feb15_21_NK.one;

public class Execution {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        System.out.println(stack.isEmpty());
        stack.push(new Node(5));
        System.out.println(stack.isEmpty());
        stack.peek();
        stack.push(new Node(6));
        stack.peek();
        //stack.pop();
        stack.peek();
        stack.print();
    }
}


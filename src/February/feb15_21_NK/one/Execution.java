/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-Feb-21
 *   Time: 10:35 AM
 *   File: Execution.java
 */

package February.feb15_21_NK.one;

public class Execution {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(new Node(6));
        stack.push(new Node(5));
        stack.print();
        stack.pop();
        stack.print();
    }
}


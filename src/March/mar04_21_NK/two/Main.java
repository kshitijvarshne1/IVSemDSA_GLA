/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Mar-21
 *   Time: 10:06 PM
 *   File: Main.java
 */

package March.mar04_21_NK.two;

public class Main {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(new Node(4));
        stack.push(new Node(5));
        stack.peek();
        stack.pop();
        stack.peek();
    }
}


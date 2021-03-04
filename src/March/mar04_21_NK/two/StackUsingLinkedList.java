/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Mar-21
 *   Time: 9:20 PM
 *   File: StackUsingLinkedList.java
 */

package March.mar04_21_NK.two;

public class StackUsingLinkedList {
    public Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Node newNode) {
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(top.data);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(top.data);
            top = top.next;
        }
    }

}


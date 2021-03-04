/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-Feb-21
 *   Time: 10:20 AM
 *   File: StackUsingLinkedList.java
 */

package February.feb15_21_NK.one;

public class StackUsingLinkedList {
    Node top;

    public StackUsingLinkedList() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        return false;
    }

    public void push(Node newNode) {
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println(top.data);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        top = top.next;
    }
}


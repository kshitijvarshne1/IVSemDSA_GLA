/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Jun-21
 *   Time: 8:47 AM
 *   File: StackUsingLinkedList.java
 */

package June.jun22_21.one;

public class StackUsingLinkedList {
    public Node head;

    public StackUsingLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(Node newNode) {
        newNode.setNext(head);
        head = newNode;
    }

    public Node peek() {
        if (isEmpty()) {
            return null;
        } else {
            return head;
        }
    }

    public void pop() {
        if (isEmpty()) {
            return;
        } else {
            head = head.getNext();
        }
    }

    public void deleteStack() {
        head = null;
    }
}


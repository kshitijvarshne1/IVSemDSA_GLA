/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 05-Mar-21
 *   Time: 2:13 AM
 *   File: CircularQueueUsingLinkedList.java
 */

package March.mar05_21_NK.two;

import March.mar03_21_NK.Node;

public class CircularQueueUsingLinkedList {
    public Node head;
    public Node tail;

    public CircularQueueUsingLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void dequeue(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

}


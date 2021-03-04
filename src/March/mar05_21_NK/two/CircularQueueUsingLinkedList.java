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

    public void enqueue(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = tail.next;
            tail.next = head;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else if (head.next == head) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Underflow");
        } else {
            System.out.println(head.data);
        }
    }

}


/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Feb-21
 *   Time: 7:45 PM
 *   File: DoublyEndedQueue.java
 */

package February.feb24_21_NK;

public class DoublyEndedQueue {
    public Node head;
    public Node tail;

    public DoublyEndedQueue() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueueAtFront(Node newNode) {
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return;
    }

    public void enqueueAtEnd(Node newNode) {
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void dequeueAtFirst() {
        if (!isEmpty()) {
            Node temp = head;
            head = head.next;
            //Only one node is present
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            return;
        }
        System.out.println("Dequeue is empty");
    }

    public void dequeueAtEnd() {
        if (!isEmpty()) {
            Node temp = tail;
            tail = tail.prev;

            //only one Node is present
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
            return;
        }
        System.out.println("Dequeue is Empty");
    }

}


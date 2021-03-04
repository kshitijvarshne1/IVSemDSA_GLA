/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Mar-21
 *   Time: 10:53 PM
 *   File: QueueUsingLinkedList.java
 */

package March.mar04_21_NK.four;

public class QueueUsingLinkedList {
    public Node front;
    public Node rear;

    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(Node newNode) {
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Underflow");
        } else if (front == rear && front != null) {
            System.out.println(front.data);
            front = rear = null;
        } else {
            System.out.println(front.data);
            front = front.next;
        }
    }

    public void peek() {
        if (front == null) {
            System.out.println("Empty");
        } else {
            System.out.println(front.data);
        }
    }

    public boolean isFull() {
        return false;
    }
}


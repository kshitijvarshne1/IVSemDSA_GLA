/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Jun-21
 *   Time: 9:27 AM
 *   File: QueueUsingLinkedList.java
 */

package June.jun22_21.two;

public class QueueUsingLinkedList {
    public Node front;
    public Node rear;

    public QueueUsingLinkedList() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Node newNode) {
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(front.getData());
            front = front.getNext();
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(front.getData());
        }
    }
}


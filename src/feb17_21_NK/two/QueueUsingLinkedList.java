/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Feb-21
 *   Time: 8:29 PM
 *   File: QueueUsingLinkedList.java
 */

package feb17_21_NK.two;

public class QueueUsingLinkedList {
    public Node front;
    public Node rear;

    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(Node newNode) {
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue() {
        if (!isEmpty()) {
            System.out.println(front.data);
            front = front.next;
            return;
        }
        System.out.println("Queue is empty");
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public void print() {
        if (front != null) {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
            return;
        }
        System.out.println("Queue is empty");
    }

}


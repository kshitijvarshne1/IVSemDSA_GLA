/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 23-Jun-21
 *   Time: 8:28 AM
 *   File: PriorityQueue.java
 */

package June.jun23_21.one;

// Two types of pq
/*
 * 1. ascending pq
 * 2. descending pq
 *
 * implemented in two ways
 * 1. simple insertion and special deletion
 * 2. special insertion and simple deletion
 * */
public class PriorityQueue {
    public Node front;
    public Node rear;

    public PriorityQueue() {
        this.front = this.rear = null;
    }

    public void enqueue(Node newNode) {
        if (front == null || newNode.getPriority() > front.getPriority()) {
            newNode.setNext(front);
            front = newNode;
        } else {
            Node tmp = front;
            while (front.getNext() != null || tmp.getPriority() <= newNode.getPriority()) {
                tmp = tmp.getNext();
            }
            newNode.setNext(tmp.getNext());
            tmp.setNext(newNode);
        }
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(front.getData() + " " + front.getPriority());
            front = front.getNext();
        }
    }

    public void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(front.getData() + " " + front.getPriority());

        }

    }

    public void traverse() {
        if (front != null) {
            Node tmp = front;

            while (tmp != null) {
                System.out.print(tmp.getData() + " -> ");
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }
}


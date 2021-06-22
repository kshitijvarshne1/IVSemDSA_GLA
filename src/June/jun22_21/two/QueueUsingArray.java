/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Jun-21
 *   Time: 9:06 AM
 *   File: QueueUsingArray.java
 */

package June.jun22_21.two;

public class QueueUsingArray {
    int[] arr;
    int front;
    int rear;

    public QueueUsingArray(int size) {
        arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public void deleteQueue() {
        arr = null;
    }

    public void enqueue(int value) {
        if (isEmpty()) {
            front = rear = 0;
            arr[front] = value;
        } else if (isFull()) {
            System.out.println("Queue is full");
        } else {
            rear++;
            arr[rear] = value;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front]);
            front++;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            System.out.println(arr[front]);
        }
    }
}


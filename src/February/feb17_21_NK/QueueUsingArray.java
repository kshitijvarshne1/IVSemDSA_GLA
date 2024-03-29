/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Feb-21
 *   Time: 7:21 PM
 *   File: QueueUsingArray.java
 */

package February.feb17_21_NK;

public class QueueUsingArray {
    int[] arr;
    int front;
    int rear;
    int size;

    public QueueUsingArray(int size) {
        arr = new int[size];
        this.front = 0;
        this.rear = -1;
        this.size = size;
    }

    public void enqueue(int d) {
        if (!isFull()) {
            rear += 1;
            arr[rear] = d;
            return;
        }
        System.out.println("Queue is full");
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println(arr[front]);
            this.front = 0;
            this.rear = -1;
            return;
        } else if (!isEmpty() && rear != -1) {
            System.out.println(arr[front]);
            front += 1;
            return;
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public boolean isEmpty() {
        return rear != arr.length - 1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }
}


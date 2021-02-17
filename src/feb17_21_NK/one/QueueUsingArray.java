/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Feb-21
 *   Time: 7:21 PM
 *   File: QueueUsingArray.java
 */

package feb17_21_NK.one;

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
        if (!isEmpty()) {
            System.out.println(arr[front]);
            front += 1;
            return;
        }
        System.out.println("Queue is Empty");
    }

    public boolean isEmpty() {
        return rear == front - 1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }
}


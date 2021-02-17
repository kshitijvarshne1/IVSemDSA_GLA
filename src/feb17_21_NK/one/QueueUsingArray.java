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
        this.rear = 0;
        this.size = size;
    }

    public void enqueue(int d) {
        if (!isFull()) {
            arr[rear] = d;
            rear += 1;
            return;
        }
        System.out.println("Queue is full ");
    }

    public int dequeue() {
        if (!isEmpty()) {
            int k = front;
            front += 1;
            return arr[front];
        }
        return -1;
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    public boolean isFull() {
        return rear == size - 1;
    }
}


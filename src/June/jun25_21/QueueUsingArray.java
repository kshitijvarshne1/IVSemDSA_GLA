/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Jun-21
 *   Time: 11:45 AM
 *   File: QueueUsingArray.java
 */

package June.jun25_21;

public class QueueUsingArray {
    int[] arr;
    int front;
    int rear;

    public QueueUsingArray(int size) {
        arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public void pushFront(int element) {
        if (full()) {
            System.out.println("Overflow");
        } else {

            if (front == -1) {
                front = rear = 0;
            } else if (front == 0) {
                front = arr.length - 1;
            } else {
                --front;
            }

            arr[front] = element;
        }

    }

    public void pushback(int element) {
        if (full()) {
            System.out.println("Overflow");
        } else {
            if (front == -1) {
                front = rear = 0;
            } else if (rear == arr.length - 1) {
                rear = 0;
            } else {
                ++rear;
            }
            arr[rear] = element;
        }
    }

    public boolean full() {
        return (front == 0 && rear == arr.length - 1) || (front == rear + 1);
    }

    public boolean empty() {
        return front == -1;
    }
}


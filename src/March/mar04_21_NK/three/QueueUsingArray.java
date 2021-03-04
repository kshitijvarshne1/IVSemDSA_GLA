/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Mar-21
 *   Time: 10:11 PM
 *   File: QueueUsingArray.java
 */

package March.mar04_21_NK.three;

public class QueueUsingArray {
    public int[] arr;
    public int front;
    public int rear;

    public QueueUsingArray(int size) {
        arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Overflow");
        } else if (front == rear) {
            front = rear = 0;
            arr[front] = data;
        } else {
            rear += 1;
            arr[rear] = data;
        }
    }

    public void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else if (front == rear) {
            System.out.println(arr[front]);
            front = rear - 1;
        } else {
            System.out.println(arr[front]);
            front += 1;
        }
    }

    public void peek() {
        if (rear == -1 && front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(arr[rear]);
        }
    }

    public void print() {
        if (front == -1 && rear == -1) {
            System.out.println("Empty");
        } else {
            int a = front;
            int b = rear;
            while (a <= b) {
                System.out.print(arr[a] + " ");
                a += 1;
            }
            System.out.println();
        }
    }

}


/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Mar-21
 *   Time: 11:51 PM
 *   File: CircularQueueUsingArray.java
 */

package March.mar05_21_NK.one;

public class CircularQueueUsingArray {
    public int[] arr;
    public int front;
    public int rear;

    public CircularQueueUsingArray(int size) {
        arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(int data) {
        if (front == -1 && rear == -1) {
            front = rear = 0;
            arr[rear] = data;
        } else if ((rear + 1) % arr.length == front) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % arr.length;
            arr[rear] = data;
        }
    }

    public void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else if (front == rear) {
            System.out.println(arr[front]);
            front = rear = -1;
        } else {
            System.out.println(arr[front]);
            front = (front + 1) % arr.length;
        }
    }

    public void peek() {
        if (front == -1 && rear == -1) {
            System.out.println("Empty");
        } else {
            System.out.println(arr[front]);
        }
    }

    public boolean isFull() {
        return front == (rear + 1) % arr.length;
    }

    public void print() {
        if (front == -1 && rear == -1) {
            System.out.println("Empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(arr[i] + " ");
                i = (i + 1) % arr.length;
            }
            System.out.print(arr[i]);
            System.out.println();
        }
    }
}


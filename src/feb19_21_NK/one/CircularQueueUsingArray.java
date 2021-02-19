/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Feb-21
 *   Time: 7:52 PM
 *   File: CircularQueueUsingArray.java
 */

package feb19_21_NK.one;

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
            arr[front] = data;
        } else if (!isFull()) {
            rear = (rear + 1) % arr.length;
            arr[rear] = data;
        } else {
            System.out.println("Queue is full");
        }
    }

    public boolean isFull() {
        return (rear + 1) % arr.length == front;
    }
}


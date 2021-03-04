/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Mar-21
 *   Time: 8:27 PM
 *   File: StackUsingArray.java
 */

package March.mar04_21_NK.one;

public class StackUsingArray {
    int[] arr;
    int top;

    public StackUsingArray(int size) {
        arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return arr.length - 1 == top;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Full");
        } else {
            top += 1;
            arr[top] = data;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(arr[top]);
            top -= 1;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(arr[top]);
        }
    }
}


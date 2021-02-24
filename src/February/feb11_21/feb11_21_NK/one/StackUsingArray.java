/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-Feb-21
 *   Time: 6:16 PM
 *   File: StackUsingArray.java
 */

package February.feb11_21.feb11_21_NK.one;

public class StackUsingArray {
    int[] arr;
    int top;

    public StackUsingArray(int size) {
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public void push(int value) {
        if (!isFull()) {
            top += 1;
            arr[top] = value;
            return;
        }
        System.out.println("Stack is full");
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }

    public void pop() {
        if (!isEmpty()) {
            top -= 1;
            return;
        }
        System.out.println("Underflow");
    }

    public void deleteStack() {
        arr = null;
    }

    public void print() {
        if (!isEmpty()) {
            int count = top;
            for (int i = count; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        System.out.println("Stack is empty");
    }

}


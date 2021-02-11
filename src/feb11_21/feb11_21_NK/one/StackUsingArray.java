/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-Feb-21
 *   Time: 6:16 PM
 *   File: StackUsingArray.java
 */

package feb11_21.feb11_21_NK.one;

public class StackUsingArray {
    int[] arr;
    int top;

    public StackUsingArray(int size) {
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top != arr.length - 1;
    }

    public boolean isFull() {
        return top == arr.length;
    }

    public void push(int value) {
        if (isEmpty()) {
            top += 1;
            arr[top] = value;
            return;
        }
        System.out.println("Stack is full");
        return;
    }

    public int top() {
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
        return;
    }

    public void deleteStack() {
        arr = null;
    }
}


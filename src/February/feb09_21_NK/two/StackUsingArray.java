/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 03-Mar-21
 *   Time: 1:17 AM
 *   File: StackUsingArray.java
 */

package February.feb09_21_NK.two;

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
        return top == arr.length - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            this.top += 1;
            arr[top] = data;
        } else {
            System.out.println("OverFlow");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            top -= 1;
        } else {
            System.out.println("UnderFLow");
        }
    }

    public int peek() {
        if (top != -1) {
            return arr[top];
        } else {
            return -1;
        }
    }
}


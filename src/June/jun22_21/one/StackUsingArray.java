/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Jun-21
 *   Time: 8:23 AM
 *   File: StackUsingarray.java
 */

package June.jun22_21.one;

public class StackUsingArray {
    int[] arr;
    int top;

    public StackUsingArray(int size) {
        arr = new int[size];
        this.top = -1;

    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == arr.length - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return arr[top];
        }
    }
}


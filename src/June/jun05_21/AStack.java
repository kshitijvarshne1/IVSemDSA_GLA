/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 05-Jun-21
 *   Time: 2:56 PM
 *   File: AStack.java
 */

package June.jun05_21;

public class AStack {
    int[] arr;
    int maxSize;
    int top;

    public AStack(int maxSize) {
        this.arr = new int[maxSize];
        this.maxSize = maxSize;
        this.top = -1;
    }

    public void push(int data) {
        if (top < maxSize) {
            top += 1;
            arr[top] = data;
        } else {
            System.out.println("Stack is full");
        }
    }

    public int peek() {
        if (top != -1) {
            return arr[top];
        }
        return -1;

    }
}


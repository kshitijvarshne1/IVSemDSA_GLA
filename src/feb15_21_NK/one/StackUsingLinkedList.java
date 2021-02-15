/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-Feb-21
 *   Time: 10:20 AM
 *   File: StackUsingLinkedList.java
 */

package feb15_21_NK.one;

public class StackUsingLinkedList {
    Node top;

    public StackUsingLinkedList() {
        top = null;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return false;
    }
}


/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Jun-21
 *   Time: 9:27 AM
 *   File: QueueUsingLinkedList.java
 */

package June.jun22_21.two;

public class QueueUsingLinkedList {
    public Node front;
    public Node rear;

    public QueueUsingLinkedList() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }
}


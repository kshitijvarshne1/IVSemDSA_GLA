/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Feb-21
 *   Time: 7:40 PM
 *   File: Node.java
 */

package February.feb24_21_NK;

public class Node<T> {
    T data;
    Node next;
    Node prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


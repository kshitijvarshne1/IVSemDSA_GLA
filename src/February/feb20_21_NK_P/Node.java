/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-Feb-21
 *   Time: 1:29 PM
 *   File: Node.java
 */

package February.feb20_21_NK_P;

public class Node {
    public Node prev;
    public int data;
    public Node next;

    public Node(int d) {
        this.prev = null;
        this.data = d;
        this.next = null;
    }
}


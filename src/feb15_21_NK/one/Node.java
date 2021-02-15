/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-Feb-21
 *   Time: 10:17 AM
 *   File: Node.java
 */

package feb15_21_NK.one;

public class Node {
    public int data;
    public Node next; // self reference structure

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int d) {
        data = d;
        next = null;
    }
}

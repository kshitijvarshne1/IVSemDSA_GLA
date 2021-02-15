/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-Feb-21
 *   Time: 10:17 AM
 *   File: Node.java
 */

package feb15_21_NK.one;

public class Node {
    int data;
    Node next; // self reference structure

    public Node(int d) {
        data = d;
        next = null;
    }

}

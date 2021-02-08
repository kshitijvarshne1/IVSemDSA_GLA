/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Feb-21
 *   Time: 10:55 AM
 *   File: Node.java
 */

package feb08_21_NK.LinkedList;

public class Node {
    int data;
    Node next; // self reference structure

    public Node(int d) {
        data = d;
        next = null;
    }
}


/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 03-Mar-21
 *   Time: 10:12 PM
 *   File: Node.java
 */

package March.mar03_21;

public class Node {
    public int data;
    public Node next;
    public Node pre;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.pre = null;
    }
}

/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Mar-21
 *   Time: 10:23 AM
 *   File: Node.java
 */

package March.Base;

public class Node {
    public Employee data;
    public Node next;

    public Node(Employee data) {
        this.data = data;
        this.next = null;
    }
}


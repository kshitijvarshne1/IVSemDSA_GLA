/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Jun-21
 *   Time: 9:18 AM
 *   File: Node.java
 */

package June.jun21_21.two;

public class Node {
    private char data;
    private Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


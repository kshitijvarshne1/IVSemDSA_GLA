/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 03-Mar-21
 *   Time: 10:14 PM
 *   File: CircularLinkedList.java
 */

package March.mar03_21;

public class CircularLinkedList {
    public Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void insertAtEnd(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}


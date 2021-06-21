/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Jun-21
 *   Time: 10:05 AM
 *   File: DoublyLinkedList.java
 */

package June.jun21_21.two;

public class DoublyLinkedList {
    public DNode head;
    public DNode tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    public void insertAtHead(DNode newNode) {
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
        }
    }

    public void insertAtEnd(DNode newNode) {
        newNode.setNext(head);
        head = newNode;
    }
}


/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-Feb-21
 *   Time: 1:28 PM
 *   File: DoublyLinkedList.java
 */

package feb20_21_NK_P;

public class DoublyLinkedList {
    public Node head;
    public Node tail;

    public void insertAtBegin(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteAtEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        tail.prev.next = null;
        tail.prev = null;
    }

}


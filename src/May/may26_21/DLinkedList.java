/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 26-May-21
 *   Time: 7:52 PM
 *   File: DLinkedList.java
 */

package May.may26_21;

public class DLinkedList {
    public Node head;
    public Node tail;

    public DLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(Node newNode) {
        if (head == null && tail == null) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> <- ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void insertAtBegin(Node newNode) {
        if (head == null) {
            head = tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void deleteAtEnd() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next.prev = null;
            tail.next = null;
        }
    }
}


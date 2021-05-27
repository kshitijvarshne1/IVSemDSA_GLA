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

    public void deleteAtBegin() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = tail = null;
        } else {
            /*Node temp = head.next;
            head.next.prev = null;
            head.next = null;
            head = temp;*/
            head = head.next;
            head.prev = null;
        }
    }

    public void insertAtMiddle(Node newNode) {
        if (head == null) {
            head = tail = newNode;
        } else if (head.next == null) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            Node slow = head;
            Node fast = head.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            newNode.next = slow.next;
            slow.next.prev = newNode;
            newNode.prev = slow;
            slow.next = newNode;


        }
    }
}


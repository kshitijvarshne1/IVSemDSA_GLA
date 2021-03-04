/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 02-Mar-21
 *   Time: 8:07 PM
 *   File: DoublyLinkedList.java
 */

package March.mar02_21_NK.two;

public class DoublyLinkedList {
    public Node head;
    public Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAtBegin(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void deleteAtBegin() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;

        }
    }

    public void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next.prev = null;
            tail.next = null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Empty");
        }
    }

    public void sorting() {
        if (!isEmpty()) {
            Node current = head;
            Node index = null;

            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        int temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        } else {
            System.out.println("Empty");
        }
    }
}


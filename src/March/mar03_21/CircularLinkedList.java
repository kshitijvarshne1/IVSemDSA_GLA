/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 03-Mar-21
 *   Time: 10:14 PM
 *   File: CircularLinkedList.java
 */

package March.mar03_21;

public class CircularLinkedList {
    public Node head;
    public Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = tail.next;
            tail.next = head;
        }
    }

    public void insertAtBegin(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {

        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            Node temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }
}


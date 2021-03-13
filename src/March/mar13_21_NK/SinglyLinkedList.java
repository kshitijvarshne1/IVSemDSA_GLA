/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 13-Mar-21
 *   Time: 1:49 PM
 *   File: SinglyLinkedList.java
 */

package March.mar13_21_NK;


public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertAtEnd(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtBegin(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void deleteAtEnd() {
        if (!isEmpty() && head.next == null) {
            head = null;
        } else if (!isEmpty()) {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        } else {
            System.out.println("empty");
        }
    }

    public void deleteAtBegin() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("empty");
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
}


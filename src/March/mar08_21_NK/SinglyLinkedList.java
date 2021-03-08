/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Mar-21
 *   Time: 10:53 PM
 *   File: SinglyLinkedList.java
 */

package March.mar08_21_NK;

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

    public void sorting() {
        if (!isEmpty()) {
            Node current = head;
            Node index = null;

            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.id > index.data.id) {
                        int temp = current.data.id;
                        current.data.id = index.data.id;
                        index.data.id = temp;
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



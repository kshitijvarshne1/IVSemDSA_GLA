/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 02-Mar-21
 *   Time: 7:40 PM
 *   File: SinglyLinkedList.java
 */

package March.mar02_21_NK.one;

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

    public void reverse() {
        if (!isEmpty()) {
            Node next = null;
            Node prev = null;
            Node temp = head;
            while (temp != null) {
                next = temp.next;
                temp.next = prev;
                prev = temp;
                temp = next;
            }
            head = prev;
        }
    }

    public boolean search(Node newNode) {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == newNode.data) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public int length() {
        int c = 0;
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                c += 1;
                temp = temp.next;
            }
        }
        return c;
    }

    public void addNodeOnKPosition(int k, Node newNode) {
        if (k == 0) {
            newNode.next = head;
            head = newNode;
        } else if (k >= length()) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        } else {
            int c = 0;
            Node temp = head;
            while (c != k - 1) {
                c += 1;
                temp = temp.next;
            }
            newNode.next = temp;
            temp.next = newNode;
        }
    }

}

